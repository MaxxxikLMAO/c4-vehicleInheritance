package Vehicles_inheritance;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", 110, "Benzin");
        Ponorka ponorka = new Ponorka("Burgiros69", 69000, "fakt nwm kamo", "69km");
        Helikopter helikopter = new Helikopter("CHELIKOPTER-CHELIKOPTER", 88686, "nejakej fuelec bracho zas vim hovno", 4, 20);

        car.getStats();
        System.out.println("");
        ponorka.getStats();
        System.out.println("");
        helikopter.getStats();
    }
}
