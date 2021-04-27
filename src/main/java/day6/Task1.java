package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2000);
        car.setColour("red");
        car.setModel("bmw");

        Motorbike motorbike = new Motorbike(1995, "Yellow", "Honda");
        car.info();
        System.out.println(car.getYear() + ", " + car.getModel() + ", " + car.getColour());
        motorbike.info();
        System.out.println(motorbike.getYearOfConstruction() + ", " + motorbike.getModel() + ", " + motorbike.getColour());

    }
}
