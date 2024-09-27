import OperationOk from "./OperationOk.js";


export default class PlusOk extends OperationOk{
    constructor(a, b) {
        super();
        this.a = a;
        this.b = b;
    }


    resultat() {
        return this.a + this.b;
    }
}
