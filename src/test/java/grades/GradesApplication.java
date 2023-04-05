package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    private HashMap<String, String> students= new HashMap<>();

    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
        students.put("superRyan", "Ryan");
        students.put("wonderOlive", "Olive");
        students.put("BestLeon", "Leon");
        students.put("NeverDevil", "Devil");

        Student Ryan = new Student("Ryan");
        Ryan.addGrade(54);
        Ryan.addGrade(74);
        Ryan.addGrade(99);

        Student Olive = new Student("Olive");
        Olive.addGrade(98);
        Olive.addGrade(87);
        Olive.addGrade(97);

        Student Leon = new Student("Leon");
        Leon.addGrade(99);
        Leon.addGrade(100);
        Leon.addGrade(98);

        Student Devil = new Student("Devil");
        Devil.addGrade(84);
        Devil.addGrade(97);
        Devil.addGrade(91);

        System.out.println("Welcome!");
        System.out.println("Here are the Github usernames of our students: ");
        System.out.println("|superRyan|  |wonderOlive|  |BestLeon|    |NeverDevil|");


        Scanner objectScanner = new Scanner(System.in);
        System.out.println("What student would you like to see more information on? ");
        String userChoice = objectScanner.nextLine();

        boolean confirmation = true;

        switch (userChoice) {
            case "superRyan":
                System.out.printf("Name: %s - GitHub Username: %s %n", students.get(userChoice), userChoice);
                System.out.printf("Current Average: %s", Ryan.getGradeAverage());
                break;

            case "wonderOlive":
                System.out.printf("Name: %s - GitHub Username: %s %n", students.get(userChoice), userChoice);
                System.out.printf("Current Average: %s", Olive.getGradeAverage());
                break;

            case "BestLeon":
                System.out.printf("Name: %s - GitHub Username: %s %n", students.get(userChoice), userChoice);
                System.out.printf("Current Average: %s", Leon.getGradeAverage());
                break;

            case "NeverDevil":
                System.out.printf("Name: %s - GitHub Username: %s %n", students.get(userChoice), userChoice);
                System.out.printf("Current Average: %s", Devil.getGradeAverage());
                break;

            default:
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\" %n%n",userChoice);

                Scanner objectScanner = new Scanner(System.in);
                System.out.println("Would you like to see another student? <y/N>");
                String userConfirm = objectScanner.nextLine();


        }

    }

}
