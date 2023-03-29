import java.util.Scanner;

public class MethosExercises {
    public static void main(String[] args) {
        System.out.println(addition(3, 5));
        System.out.println(subtraction(6, 3));
        System.out.println(multiplication(4, 8));
        System.out.println(division(10, 2)); //Can NOT divide by zero.
        multiplicationWLoop(1);

        getInteger(1, 100);
    }

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int division(int x, int y) {
        return x / y;
    }

    public static void multiplicationWLoop(int n) {
        if (n >= 200) {
            System.out.println("It passed 200");
            return;
        }
        multiplicationWLoop(n + n);
        System.out.println(n);
    }

    public static int getInteger(int min, int max) {
        Scanner scanInput = new Scanner(System.in);
        System.out.printf("Enter a number between %s and %s: ",min,max);
        int userInput = scanInput.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("Thank you for your cooperation");
            return userInput;
        }
        System.out.println("Please input valid number");
        return getInteger(min, max);
    }
}

