package uha.ensisa.archiobjet.calculatrice;

public class Add extends Operation {
    private Valuable a, b;

    public Add(Valuable a, Valuable b) {
        super(a,b);
        this.a = a;
        this.b = b;
    }

    @Override
    public int resultat() {
        return a.resultat() + b.resultat();
    }

    @Override
    public String toString() {
        return "Add{" +
                "left=" + a +
                ", right=" + b +
                '}';
    }

}
