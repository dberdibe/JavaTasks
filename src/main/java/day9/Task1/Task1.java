package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Human human = new Human("andrey");
        Student student = new Student("Alex", "PS");
        Teacher teacher = new Teacher("Mark", "Math");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}
