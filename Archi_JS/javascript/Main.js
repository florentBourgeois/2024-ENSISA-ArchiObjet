import Value from "./Composite/Value.js";
import Calculatrice from "./Composite/Calculatrice.js";
import CalculatriceOk from "./CalculatriceOk/CalculatriceOk.js";
import ValeurOk from "./CalculatriceOk/ValeurOk.js";
import PlusOk from "./CalculatriceOk/PlusOk.js";
import Plus from "./Composite/Plus.js";
import Mult from "./Composite/Mult.js";
import Minus from "./Composite/Minus.js";
import Div from "./Composite/Div.js";


function demo() {
    console.log('\n\n\n-----------calculatrice ok -----------')
    let calcOk = new CalculatriceOk();
    let vOk = new ValeurOk(5);
    console.log("5 -> " + calcOk.calcule(vOk));

    let plusOk = new PlusOk(10, 35);
    console.log("10 + 35 -> " + calcOk.calcule(vOk));


    console.log('\n\n\n-----------démonstration délégation-----------')
    let v = new Value(5);

    let calculatrice = new Calculatrice(v);
    console.log("calculatrice.applyOperation() : " + calculatrice.applyOperation());

    v = new Value(10);
    calculatrice.setOperation(v);
    console.log("calculatrice.applyOperation() : " + calculatrice.applyOperation());

    console.log('\n\n\n-----------démonstration Composite-----------')

    v = new Plus(v, new Value(100));
    calculatrice.setOperation(v);
    console.log('-----------operation = 10 + 100 Composite-----------')
    console.log(v.print());
    console.log("calculatrice.applyOperation(PLUS) : " + calculatrice.applyOperation());

    let v2 = new Plus(v, new Value(30));
    calculatrice.setOperation(v2);
    console.log('-----------operation = (10 + 100)+30 Composite-----------')
    console.log(v2.print());
    console.log("calculatrice.applyOperation(PLUS de Plus) : " + calculatrice.applyOperation());

    let complexAdd = new Plus(new Plus(new Value(4), new Plus(new Value(2), new Value(1))), new Plus(new Value(30), new Value(11)));
    console.log('-----------operation = pleisn de +  Composite-----------')
    console.log(complexAdd.print());
    calculatrice.setOperation(complexAdd);
    console.log("calculatrice.applyOperation() : " + calculatrice.applyOperation());

    let complexOp = new Mult(
        new Value(3),
        new Minus(
            new Plus(
                new Value(3),
                new Value(2)),
            new Plus(
                new Value(5),
                new Value(6)
            )
        )
    )
    console.log('-----------operation = 3*((3+2)-(5+6))  Composite-----------')
    console.log(complexOp.print());
    calculatrice.setOperation(complexOp);
    console.log("calculatrice.applyOperation() : " + calculatrice.applyOperation());

}

demo();

