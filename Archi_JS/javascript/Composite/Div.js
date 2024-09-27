import Binary from "./Binary.js";


export default class Div extends Binary {
    constructor(opA, opB) {
        super(opA, opB);

    }


    getValue() {
        return this.opA.getValue() / this.opB.getValue();
    }

    print(){
        console.log("Div : {opA: " + this.getOpA().print() + " opB: "+ this.getOpB.print()+"}");
    }
}
