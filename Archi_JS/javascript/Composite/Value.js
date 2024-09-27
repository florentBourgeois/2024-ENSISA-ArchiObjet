import Valuable from "./Valuable.js";

export default class Value extends Valuable {
    constructor(value) {
        super();
        this.value = value;
    }


    getValue() {
        return this.value;
    }

    print(){
        console.log("Value : {" + this.value + "}");
    }
}
