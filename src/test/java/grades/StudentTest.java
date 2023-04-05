package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("David");

        System.out.printf("This student name: %s %n",student1.getName());
        student1.addGrade(9);
        student1.addGrade(10);
        student1.addGrade(5);
        student1.addGrade(6);


        System.out.println(student1.getGradesList());
        System.out.println(student1.getGradeAverage());
    }
}
