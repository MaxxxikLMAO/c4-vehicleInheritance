package Vehicles_inheritance;

public class Ponorka extends Car {
    private final String maxDepth;

    public Ponorka(String label, int power, String fueltype, String maxDepth) {
        super(label, power, fueltype);
        this.maxDepth = maxDepth;
    }

    public String getMaxDepth() {
        return maxDepth;
    }

    @Override
    public void getStats() {
        System.out.println("Značka: " + label + "\n Síla motoru: " + power + "\n Palivo: " + fueltype + "\n Maximální ponoření: " + maxDepth);
    }
}
