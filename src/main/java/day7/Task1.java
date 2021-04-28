package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplaneOne = new Airplane("boeing", 1994, 50, 190);
        Airplane airplaneTwo = new Airplane("boeing", 1994, 60, 190);
        Airplane.compareAirplanes(airplaneOne, airplaneTwo);
    }
}