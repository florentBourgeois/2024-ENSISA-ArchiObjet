import Binary from "./Binary.js";


export default class Plus extends Binary {
    constructor(opA, opB) {
        super();
        this.opA = opA;
        this.opB = opB;
    }


    getValue() {
        return this.opA.getValue() + this.opB.getValue();
    }

    print(){
        console.log("Plus : {opA: " + this.opA + " opB: "+ this.opB+"}");
    }
}
