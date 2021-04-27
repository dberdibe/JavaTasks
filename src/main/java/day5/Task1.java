package day5;
//Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”, “Модель”.
// Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
// Задать значение для каждого поля, используя set методы. Вывести в консоль значение каждого из полей, используя get методы.
//Созданный вами класс должен отвечать принципам инкапсуляции.
public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfConstruction(1995);
        car.setColour("Blue");
        car.setModel("BMW");


        System.out.println(car.getYearOfConstruction() + ", " + car.getColour() + ", " + car.getModel());
    }


    static class Car {
        int yearOfConstruction;
        String colour;
        String model;

        public int getYearOfConstruction() {
            return yearOfConstruction;
        }

        public void setYearOfConstruction(int yearOfConstruction) {
            this.yearOfConstruction = yearOfConstruction;
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
}


