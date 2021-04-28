package day6;

public class Motorbike {
    private String model;
    private String colour;
    private int yearOfConstruction;

    public Motorbike(String model, String colour, int yearOfConstruction) {
        this.model = model;
        this.colour = colour;
        this.yearOfConstruction = yearOfConstruction;
    }

    public void info(){
        System.out.println("Это мотоцикл ");
    }

    public int yearDifference(int inputYear){
        return yearOfConstruction - inputYear;
    }

    public Motorbike(int yearOfConstruction, String colour, String model) {
        this.yearOfConstruction = yearOfConstruction;
        this.colour = colour;
        this.model = model;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }
}
