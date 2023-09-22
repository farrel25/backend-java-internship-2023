package data;

public class Avanza implements Car, Bus {

    @Override
    public void drive() {
        System.out.println("Driver Avanza");
    }

    @Override
    public int getTire() {
        return 4;
    }

    @Override
    public String getBrand() {
        return null;
    }
}
