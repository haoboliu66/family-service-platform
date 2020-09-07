const twoStep = {

    state: {
        unitMessage: []
    },
    mutations: {
        SET_TITLE(state, payload){
            console.log("number == " + payload.unitMessage)
            state.unitMessage = payload.unitMessage
        }
    },
    actions: {

    },
    getters: {

    }


}

export default twoStep