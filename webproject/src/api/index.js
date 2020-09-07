const api = {
    Login: '/auth/login',
    Logout: '/auth/logout',
    ForgePassword: '/auth/forge-password',
    Register: '/auth/register',
    twoStepCode: '/auth/2step-code',
    SendSms: '/account/sms',
    SendSmsErr: '/account/sms_err',
    // get my info
    UserInfo: '/user/info',
    // property-add
    oneStep: '/oneStep',
    selectCompany: '/estate/selectCompany',
    insertEstate: '/estate/insertEstate',
    selectBuilding: '/estate/selectBuilding',
    updateBuilding: '/estate/updateBuilding',
    selectUnit: '/estate/selectUnit',
    updateUnit: '/estate/updateUnit',
    insertCell: '/estate/insertCell'
}
export default api
