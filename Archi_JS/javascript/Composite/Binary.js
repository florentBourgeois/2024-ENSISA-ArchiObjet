import Valuable from "./Valuable.js";

export default class Binary extends Valuable {
    constructor(opA, opB) {
        super();
        this.opA = opA;
        this.opB = opB;
    }


    getOpA() {
        return this.opA;
    }

    getOpB() {
        return this.opB;
    }

    print(){
        console.log("Binary : {opA: " + this.opA + " opB: "+ this.opB+"}");
    }
}
