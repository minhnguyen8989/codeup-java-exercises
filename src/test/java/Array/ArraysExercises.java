package Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        //Create an array that holds 3 Person objects
        String[] Persons = {"Minh","Van","Elena"};
        for (String Person : Persons){
            System.out.println(Person);
        }

        Persons = Arrays.copyOf(Persons, Persons.length +1);
        Persons[Persons.length -1] = addPerson();
        System.out.println(Arrays.toString(Persons));
    }

    public static String addPerson(){
        Scanner scanName = new Scanner(System.in);
        System.out.print("Enter new name: ");
        String newName = scanName.nextLine();

        return newName;

    }

}

