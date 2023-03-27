import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        //WHile loop --> for loop
        for (int i = 5; i <= 15; i++){
            System.out.println(i);
        }


        //Do while loop
        int y = 0;
        do {
            System.out.println(y);
            y += 2;
        } while (y <= 100);
//
        for (int i = 100; i >= -10; i -= 5){
            System.out.println(i);
        }
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while(i >= -10);

        for (long i = 2; i < 1000000; i*=i){
            System.out.println(i);
        }


        //FizzBuzz Test
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else if (i % 3 == 0){
                System.out.println(i + " Fizz");
            } else {
                System.out.println(i);
            }
        }

        //Display a table of powers
        int defaultNum = 1;
        Scanner userIntInput = new Scanner(System.in);
        System.out.println("What number would you like to go up to? ");
        int userNumInputed = userIntInput.nextInt();
        do {
            System.out.println("number |  squared  |  cubed");
            System.out.println("------ |  -------  |  -----");
            System.out.println(defaultNum + "     | " + (defaultNum*defaultNum) + "     | " + ((defaultNum*defaultNum)*defaultNum));
            defaultNum++;
        } while (defaultNum <= userNumInputed);

    }
}
