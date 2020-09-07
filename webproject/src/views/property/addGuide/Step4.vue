<template>
  <div>
    <!-- <a-form-model ref="ruleForm" :model="form2" :label-col="labelCol" :wrapper-col="wrapperCol"> -->
    <a-row class="header">
      Building:
      <a-select v-model="form2.building" @change="changeBuilding">
        <a-select-option :key="index" :value="item.buildingCode" v-for="(item,index) in buildingSelect">
            {{item.buildingName}}
        </a-select-option>
      </a-select>
        Unit:
      <a-select v-model="form2.unit" @change="changeUnit">
        <a-select-option :key="index" :value="item.unitCode" v-for="(item,index) in unitSelect">
            {{item.unitName}}
<!--             @change="changeUnit"-->
        </a-select-option>
      </a-select>
        BuildArea:
      <a-input style="width: 40px;padding: 0;text-align: center;" v-model="form2.buildArea" @blur="setBuildArea"></a-input>
        UsedArea:
      <a-input style="width: 40px;padding: 0;text-align: center;" v-model="form2.usedArea" @blur="setUsedArea"></a-input>
    </a-row>
    <a-row>
      <a-table :columns="columns" :dataSource="data" bordered align="center">
        <template
          v-for="col in [
            'floorNumber',
            'unitCode',
            'cellCode',
            'cellName',
            'cellBuildArea',
            'cellUsedArea',
            'remark'
          ]"
          :slot="col"
          slot-scope="text, record"
        >
          <div :key="col">
            <a-input
              v-if="record.editable"
              style="margin: -5px 0"
              :value="text"
              @change="e => handleChange(e.target.value, record.key, col)"
            />
            <template v-else>{{ text }}</template>
          </div>
        </template>
        <template slot="operation" slot-scope="text, record">
          <div class="editable-row-operations">
            <span v-if="record.editable">
              <a @click="() => save(record.key)">保存</a>&nbsp;
              <a-popconfirm title="确认取消吗?" @confirm="() => cancel(record.key)">
                <a>取消</a>
              </a-popconfirm>
            </span>
            <span v-else>
              <a :disabled="editingKey !== ''" @click="() => edit(record.key)">编辑</a>
            </span>
          </div>
        </template>
      </a-table>
      <a-row>
        <a-button type="primary" @click="nextStep()">下一步</a-button>&nbsp;
        <a-button type="primary" @click="prevStep()">上一步</a-button>
      </a-row>
    </a-row>
  </div>
</template>

<script>
    import { insertCell, selectBuildingByEstate, selectCell, selectUnitByBuildingCode } from '@/api/estate'
    const QS = require('qs')
const columns = [
    {
        align: 'center',
        title: 'unitCode',
        dataIndex: 'unitCode',
        width: '6%',
        scopedSlots: { customRender: 'unitCode ' }
    },
    {
        align: 'center',
        title: 'floorNumber',
        dataIndex: 'floorNumber',
        width: '6%',
        scopedSlots: { customRender: 'floorNumber' }
    },
    {
        align: 'center',
        title: 'cellCode',
        dataIndex: 'cellCode',
        width: '6%',
        scopedSlots: { customRender: 'cellCode' }
    },
    {
        align: 'center',
        title: 'cellName',
        dataIndex: 'cellName',
        width: '6%',
        scopedSlots: { customRender: 'cellName' }
    },
    {
        align: 'center',
        title: 'cellBuildArea',
        dataIndex: 'cellBuildArea',
        width: '6%',
        scopedSlots: { customRender: 'cellBuildArea' }
    },
    {
        align: 'center',
        title: 'cellUsedArea',
        dataIndex: 'cellUsedArea',
        width: '7%',
        scopedSlots: { customRender: 'cellUsedArea' }
    },
    {
        align: 'center',
        title: 'remark',
        dataIndex: 'remark',
        width: '38%',
        scopedSlots: { customRender: 'remark' }
    },
    {
        align: 'center',
        title: '编辑',
        width: '7%',
        dataIndex: 'operation',
        scopedSlots: { customRender: 'operation' }
    }
]

const data = []

export default {
    name: 'Step4',
    data() {
        return {
            labelCol: { span: 2 },
            wrapperCol: { span: 1 },
            form2: {
                name: '',
                region: undefined,
                building: [],
                unit: [],
                buildArea: '',
                usedArea: '',
                date1: undefined,
                delivery: false,
                type: [],
                resource: '',
                desc: ''
            },
            data,
            columns,
            editingKey: '',
            buildingSelect: [],
            unitSelect: []
        }
    },
    created(){
        insertCell(this.$store.state.threeStep.cellMessage)
        .then(res =>{
            const list = res.result
            for (let i = 0; i < list.length; i++) {
                const cell = list[i];
                data.push({
                    key: cell.id,
                    unitCode: cell.unitCode,
                    floorNumber: cell.floorNumber,
                    cellCode: cell.cellCode,
                    cellName: cell.cellName,
                    cellBuildArea: cell.cellBuildArea,
                    cellUsedArea: cell.cellUsedArea,
                    remark: ''
                })
            }
            this.cacheData = data.map(item => ({ ...item }))
        }).catch(err =>{

        })
        const param = QS.stringify({estateCode: this.$store.state.threeStep.estateCode})
        // console.log(param)
        selectBuildingByEstate(param)
        .then(res =>{
            this.buildingSelect = res.result
        })


    },

    methods: {
        // <input>统一修改值
        setBuildArea(){
            const buildArea = this.form2.buildArea
            if(buildArea <= 0){
                setTimeout(()=>{this.$notification.error({
                    message: 'error',
                    description: 'buildArea must be greater than 0'
                })},500)
                this.form2.buildArea = ''
                return false
            }
            for(let i = 0; i < this.data.length; i++){
                this.data[i].cellBuildArea = buildArea
            }
        },
        // <input>统一修改值
        setUsedArea(){
            const usedArea = this.form2.usedArea
            // const buildArea = this.form2.buildArea
            // console.log(usedArea)
            // if(usedArea > 0 && usedArea > buildArea){
            //     this.$notification.error({
            //         message: 'error',
            //         description: 'buildArea must be greater than usedArea'
            //     })
            //     this.form2.usedArea = ''
            //     return false
            // }
            // console.log("used " + usedArea)
            for(let i = 0; i < this.data.length; i++){
                this.data[i].cellUsedArea = usedArea
            }
        },
        // filter cells by unitCode
        changeUnit(){
            const param = QS.stringify({unitCode: this.form2.unit})
            const filteredData = []
            selectCell(param)
            .then(res =>{
                const list = res.result
                for (let i = 0; i < list.length; i++) {
                    const cell = list[i];
                    filteredData.push({
                        key: cell.id,
                        unitCode: cell.unitCode,
                        floorNumber: cell.floorNumber,
                        cellCode: cell.cellCode,
                        cellName: cell.cellName,
                        cellBuildArea: cell.cellBuildArea,
                        cellUsedArea: cell.cellUsedArea,
                        remark: ''
                    })
                }
                this.data = filteredData
                this.cacheData = this.data.map(item => ({ ...item }))
            })
        },
        changeBuilding(){
            const param = QS.stringify({buildingCode: this.form2.building})
            selectUnitByBuildingCode(param)
            .then(res =>{
                this.unitSelect = res.result
            })
        },
        nextStep() {

            this.$emit('nextStep')
        },
        prevStep() {
            this.$emit('prevStep')
        },
        handleChange(value, key, column) {
            const newData = [...this.data]
            const target = newData.filter(item => key === item.key)[0]
            if (target) {
                target[column] = value
                this.data = newData
            }
        },
        edit(key) {
            const newData = [...this.data]
            const target = newData.filter(item => key === item.key)[0]
            this.editingKey = key
            if (target) {
                target.editable = true
                this.data = newData
            }
        },
        save(key) {
            console.log(key)
            const newData = [...this.data]
            const newCacheData = [...this.cacheData]
            const target = newData.filter(item => key === item.key)[0]
            const targetCache = newCacheData.filter(item => key === item.key)[0]
            if (target && targetCache) {
                delete target.editable
                this.data = newData
                Object.assign(targetCache, target)
                this.cacheData = newCacheData
                this.editingKey = ''
            }
        },
        cancel(key) {
            const newData = [...this.data]
            const target = newData.filter(item => key === item.key)[0]
            this.editingKey = ''
            if (target) {
                Object.assign(target, this.cacheData.filter(item => key === item.key)[0])
                delete target.editable
                this.data = newData
            }
        }
    },
    beforeDestroy() {
        //  clearTimeout(this.timer)
    }
}
</script>

<style lang="less" scoped>
.stepFormText {
    margin-bottom: 24px;

    .ant-form-item-label,
    .ant-form-item-control {
        line-height: 22px;
    }
}
</style>
