import Value from "./Composite/Value.js";
import Calculatrice from "./Composite/Calculatrice.js";
import CalculatriceOk from "./CalculatriceOk/CalculatriceOk.js";
import ValeurOk from "./CalculatriceOk/ValeurOk.js";
import PlusOk from "./CalculatriceOk/PlusOk.js";
import Plus from "./Composite/Plus.js";


function demo(){
    console.log('\n\n\n-----------calculatrice ok -----------')
    let calcOk = new CalculatriceOk();
    let vOk = new ValeurOk(5);
    console.log("5 -> " + calcOk.calcule(vOk));

    let plusOk = new PlusOk(10,35);
    console.log("10 + 35 -> " + calcOk.calcule(vOk));






        console.log('\n\n\n-----------démonstration délégation-----------')
        let v = new Value(5);

        let calculatrice = new Calculatrice(v);
        console.log("calculatrice.applyOperation() : " + calculatrice.applyOperation());

        v = new Value(10);
        calculatrice.setOperation(v);
        console.log("calculatrice.applyOperation() : " + calculatrice.applyOperation());

        v = new Plus(v, new Value(100));
        calculatrice.setOperation(v);
        console.log("calculatrice.applyOperation(PLUS) : " + calculatrice.applyOperation());
        let v2 = new Plus(v, new Value( 30));
    calculatrice.setOperation(v2);
    console.log("calculatrice.applyOperation(PLUS de Plus) : " + calculatrice.applyOperation());





}

demo();

