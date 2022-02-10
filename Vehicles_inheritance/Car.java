package Vehicles_inheritance;

public class Car {

    final String label, fueltype;
    final int power;

    public Car(String label, int power, String fueltype) {
        this.label = label;
        this.power = power;
        this.fueltype = fueltype;
    }

    public String getLabel() {
        return label;
    }

    public int getPower() {
        return power;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void getStats() {
        System.out.println("Značka: " + label + "\n Síla motoru: " + power + "\n Palivo: " + fueltype);
    }
}
