package uha.ensisa.archiobjet.calculatrice;


public class Div extends Operation {
    private Valuable a, b;

    public Div(Valuable a, Valuable b) {
        super(a,b);
        this.a = a;
        this.b = b;
    }

    @Override
    public int resultat() {
        return a.resultat() / b.resultat();
    }

    @Override
    public String toString() {
        return "Div{" +
                "left=" + a +
                ", right=" + b +
                '}';
    }

}
