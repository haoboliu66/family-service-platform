import api from './index'
import { axios } from '@/utils/request'

export function oneStep(params) {
    return axios({
        url: api.selectCompany,
        method: 'get',
        data: params
    })
}
