package day6;

import java.util.Arrays;
import java.util.Random;

public class Teacher {
    String name;
    String lesson;

    public String getName() {
        return name;
    }

    public String getLesson() {
        return lesson;
    }

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }
    public void evaluate(Student student){
        Random random = new Random();
        int a = 2 + random.nextInt(4);

        String note;

        switch (a){
            case 2:
                note = "нудовлетворительно";
                break;
            case 3:
                note = "удовлетворительно";
                break;
            case 4:
                note = "хорошо";
                break;
            case 5:
                note = "отлично";
                break;
            default:
                note = "Unkown note";
        }
        System.out.println("Преподаватель " + getName() + " оценил студента с именем " + student.getName() + " по предмету " + lesson + " на оценку " + note);

    }


}
