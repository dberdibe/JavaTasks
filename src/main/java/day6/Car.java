package day6;
//В классах Автомобиль и Мотоцикл реализуйте два метода:
//void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
//int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год) и
// возвращает разницу между переданным годом и годом выпуска транспортного средства
// (возвращаться должно всегда положительное число).
//
//В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла, проверьте работу каждого метода.
public class Car {

    public int year;
    public String colour;
    public String model;

    public void info(){
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear){
        return year - inputYear;
    }



    public int getYear() {
        return year;
    }

    public void setYear(int yearDifference) {
        this.year = yearDifference;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}

