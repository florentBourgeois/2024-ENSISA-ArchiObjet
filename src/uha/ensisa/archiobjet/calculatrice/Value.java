package uha.ensisa.archiobjet.calculatrice;


public class Value implements Valuable {
    private int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public int resultat() {
        return value;
    }

    @Override
    public String toString() {
        return "Value{" +
                "value=" + value +
                '}';
    }
}
