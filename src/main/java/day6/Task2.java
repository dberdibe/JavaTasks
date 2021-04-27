package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("boeing", 1990, 20000, 60000);

        airplane.setYear(1995);
        airplane.setLength(25000);

        airplane.fillUp(100);
        airplane.fillUp(400);

        airplane.info();
    }
}
