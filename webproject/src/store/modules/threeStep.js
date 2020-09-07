const threeStep = {

    state: {
        cellMessage: []
    },
    mutations: {
        SET_TITLE(state, payload){
            console.log("data == " + payload.cellMessage)
            state.cellMessage = payload.cellMessage
        }
    },
    actions: {

    },
    getters: {

    }


}

export default threeStep