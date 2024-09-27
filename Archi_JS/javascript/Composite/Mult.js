import Binary from "./Binary.js";


export default class Mult extends Binary {
    constructor(opA, opB) {
        super();
        this.opA = opA;
        this.opB = opB;
    }


    getValue() {
        return this.opA.getValue() * this.opB.getValue();
    }

    print(){
        console.log("Mult : {opA: " + this.getOpA().print() + " opB: "+ this.getOpB().print()+"}");
    }
}
