import Valuable from "./Valuable.js";

export default class Calculatrice {
    constructor(value) {
        this.value = value;
    }




    applyOperation() {
        return this.value.getValue();
    }

    setOperation(value){
        this.value = value;
    }

}
