import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %s", pi);




        /**
         * System error when input is not integer*/

//        Scanner threeWordsInput = new Scanner(System.in);
//        System.out.print("Enter your first Word: ");
//        String userFirstWord = threeWordsInput.next();
//
//        System.out.print("Enter your second Word: ");
//        String userSecondWord = threeWordsInput.next();
//
//        System.out.print("Enter your third Word: ");
//        String userThirdWord = threeWordsInput.next();
//
//        System.out.println(userFirstWord);
//        System.out.println(userSecondWord);
//        System.out.println(userThirdWord);
//
//        Scanner sentenceInput = new Scanner(System.in);
//        System.out.print("Enter a sentence: ");
//        String sentenceUserInput = sentenceInput.nextLine();
//        System.out.print(sentenceUserInput);


        Scanner scanUserInput = new Scanner(System.in);
        System.out.print("Enter your classroom WIDTH: ");
        String userInputWidth = scanUserInput.nextLine();

        System.out.print("Enter your classroom HEIGHT: ");
        String userInputHeight = scanUserInput.nextLine();

        System.out.printf("you enter the width of %s, and height of %s ", userInputWidth, userInputHeight);
        System.out.println("Area of a rectangle is: " + (Integer.parseInt(userInputHeight) * Integer.parseInt(userInputWidth)));
        System.out.println("Perimeter of a rectangle is: " + ((Integer.parseInt(userInputHeight)*2) + (Integer.parseInt(userInputWidth)*2)));







    }
}
