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

        Scanner objectScanner = new Scanner(System.in);

        boolean validUser = true;

        System.out.println("Welcome!");
        System.out.println("Here are the Github usernames of our students: ");
        for (String userName : students.keySet()) {
            System.out.print(userName + " | ");
        }

        do {
            System.out.printf("%nWhat student would you like to see more information on? ");
            String userChoice = objectScanner.nextLine();

            if (students.containsKey(userChoice)){
                do {
                    System.out.println("----------------------------");
                    System.out.printf("Name: %s - GitHub Username: %s %n", students.get(userChoice), userChoice);
                    System.out.printf("Current Average: %s %n", Ryan.getGradeAverage());
                    System.out.println("----------------------------");
                    System.out.println("Would you like to see another student? <y/N>");
                    String userReChoice = objectScanner.nextLine();
                } while ();

            } else {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\" %n%n",userChoice);
                System.out.println("Would you like to see another student? <y/N>");
                String userReChoice = objectScanner.nextLine();

            }

        } while (validUser);

    }
}
