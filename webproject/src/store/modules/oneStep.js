const oneStep = {

    state: {
        buildingNumber: '',
        estateCode: ''
    },
    mutations: {
        SET_TITLE(state, payload){
            console.log("number == " + payload.buildingNumber)
            state.buildingNumber = payload.buildingNumber
            state.estateCode = payload.estateCode
        }
    },
    actions: {

    },
    getters: {

    }


}

export default oneStep