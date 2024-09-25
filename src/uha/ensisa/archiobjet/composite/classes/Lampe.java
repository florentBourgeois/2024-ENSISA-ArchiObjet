package uha.ensisa.archiobjet.composite.classes;

public class Lampe implements Allumable{

    private String color = "blanc";
    private int prix = 10;
    private boolean isOn = false;


    public Lampe() {
    }

    public Lampe(boolean isOn) {
        this.isOn = isOn;
    }

    public Lampe(String color, int prix) {
        this.color = color;
        this.prix = prix;
    }

    @Override
    public void allumer() {
        System.out.println("La lampe est allumée");
        this.isOn = true;
    }

    @Override
    public void eteindre() {
        System.out.println("La lampe est éteinte");
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
