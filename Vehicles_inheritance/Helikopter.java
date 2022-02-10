package Vehicles_inheritance;

public class Helikopter extends Car {

    private final int propellerBlades;
    private final int vzuuum;
// vzuuum je jakoze jak rychle se vrtule otoci xdd

    public Helikopter(String label, int power, String fueltype, int propellerBlades, int vzuuum) {
        super(label, power, fueltype);
        this.propellerBlades = propellerBlades;
        this.vzuuum = vzuuum;
    }

    public int getPocetVrtuli() {
        return propellerBlades;
    }

    public int getVzuuum() {
        return vzuuum;
    }

    @Override
    public void getStats() {
        System.out.println("Značka: " + label + "\n Síla motoru: " + power + "\n Palivo: " + fueltype + "\n Počet Vrtulí: " + propellerBlades + "\n Vžuuum: " + vzuuum);
    }
}
