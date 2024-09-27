package uha.ensisa.archiobjet.calculatrice;


public class Mult extends Operation {
    private Valuable a, b;

    public Mult(Valuable a, Valuable b) {
        super(a,b);
        this.a = a;
        this.b = b;
    }

    @Override
    public int resultat() {
        return a.resultat() * b.resultat();
    }


    @Override
    public String toString() {
        return "Mult{" +
                "left=" + a +
                ", right=" + b +
                '}';
    }

}
