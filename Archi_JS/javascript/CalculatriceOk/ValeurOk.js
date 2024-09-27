import OperationOk from "./OperationOk.js";


export default class ValeurOk extends OperationOk{
    constructor(a) {
        super();
        this.a = a;
    }


    resultat() {
        return this.a;
    }
}
