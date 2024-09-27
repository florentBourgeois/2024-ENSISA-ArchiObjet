package uha.ensisa.archiobjet.calculatrice;


public class Sub extends Operation {
    private Valuable a, b;

    public Sub(Valuable a, Valuable b) {
        super(a,b);
        this.a = a;
        this.b = b;
    }

    @Override
    public int resultat() {
        return a.resultat() - b.resultat();
    }


    @Override
    public String toString() {
        return "Sub{" +
                "left=" + a +
                ", right=" + b +
                '}';
    }

}
