import api from './index'
import { axios } from '@/utils/request'

export function selectCompany(params) {
    return axios({
        url: api.selectCompany,
        method: 'get',
        data: params
    })
}

export function insertEstate(data) {
    return axios({
        url: api.insertEstate,
        method: 'post',
        data: data
    })

}

export function selectBuilding(params) {
    return axios({
        url: api.selectBuilding,
        method: 'post',
        data: params
    })
}

export function updateBuilding(params) {
    return axios( {
        url: api.updateBuilding,
        method: 'post',
        data: params
    } )

}

export function selectUnit(params){
    return axios({
        url: api.selectUnit,
        method:'post',
        data: params,
        headers:{
            'Content-Type': "application/json"
        }
    })
}


export function updateUnit(params) {
    return axios({
        url: api.updateUnit,
        method: 'post',
        data: params
    })

}

export function insertCell(params) {
    return axios({
        url: api.insertCell,
        method: 'post',
        data: params,
        headers: {
            'Content-Type': "application/json"
        }
    })
}

export function selectBuildingByEstate(params) {
    return axios({
        url: api.selectBuildingByEstate,
        method: 'post',
        data: params
    })

}

export function selectUnitByBuildingCode(params) {
    return axios({
        url: api.selectUnitByBuildingCode,
        method: 'post',
        data: params
    })

}

export function selectCell(params) {
    return axios({
        url: api.selectCell,
        method: 'post',
        data: params
    })
}

export function selectEstate(params) {
    return axios({
        url: api.selectEstate,
        method: 'post',
        data: params
    })

}

