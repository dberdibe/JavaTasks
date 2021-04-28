package day7;

import com.sun.prism.shader.AlphaOne_ImagePattern_AlphaTest_Loader;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info(){
        System.out.println("Изготовитель:" +" " + producer + ", " + "год выпуска:" + " " + year + ", " + "длина:" + " " + length + ", " + "вес:" + " " + weight + ", " + "количество топлива в баке:" + " " + this.fuel);
    }

    public static void compareAirplanes(Airplane airplaneOne, Airplane airplaneTwo){
        if (airplaneOne.length > airplaneTwo.length){
            System.out.println("Первый самолет длиннее");//когда вывожу строку ниже с сообщением, то тесты не проходят
            //System.out.println("Самолет 1 длина " + airplaneOne.length + ", самолет 2 длина " + airplaneTwo.length);
        }else if (airplaneOne.length < airplaneTwo.length){
            System.out.println("Второй самолет длиннее");
            //System.out.println("Самолет 1 длина " + airplaneOne.length + ", самолет 2 длина " + airplaneTwo.length);
        }else {
            System.out.println("Длины самолетов равны");
            //System.out.println("Самолет 1 длина " + airplaneOne.length + ", самолет 2 длина " + airplaneTwo.length);
        }

    }


    public void fillUp(int n){
        fuel = fuel + n;
    }

    public double getFuel() {
        return fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
