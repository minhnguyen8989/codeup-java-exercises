//import java.util.Scanner;
//
//public class ControlFlowExercises {
//
//    public static void main(String[] args) {
//        //WHile loop --> for loop
//        for (int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }
//
//
//        //Do while loop
//        int y = 0;
//        do {
//            System.out.println(y);
//            y += 2;
//        } while (y <= 100);
////
//        for (int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }
////        int i = 100;
////        do {
////            System.out.println(i);
////            i -= 5;
////        } while(i >= -10);
//
//        for (long i = 2; i < 1000000; i*=i){
//            System.out.println(i);
//        }
//
//
//        //FizzBuzz Test
//        for (int i = 1; i <= 100; i++){
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println(i + " FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println(i + " Buzz");
//            } else if (i % 3 == 0){
//                System.out.println(i + " Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }
//
//        //Display a table of powers
////        int defaultNum = 1;
////        Scanner userIntInput = new Scanner(System.in);
////        System.out.print("What number would you like to go up to? ");
////        int userNumInputed = userIntInput.nextInt();
////        System.out.println("Here is your table!");
////        System.out.println("number |  squared  |  cubed");
////        System.out.println("------ |  -------  |  -----");
////        do {
////            System.out.println(defaultNum + "      | " + (defaultNum*defaultNum) + "        | " + ((defaultNum*defaultNum)*defaultNum));
////            defaultNum++;
////        } while (defaultNum <= userNumInputed);
//
//
//
//        //Convert given number grades into grades
//        Scanner userGradeInput = new Scanner(System.in);
//        System.out.print("Enter numerical grade from 0 to 100: ");
//        int userGradeInputed = userGradeInput.nextInt();
//        do {
//            if ( userGradeInputed <= 100 && userGradeInputed >= 88){
//                Scanner confirm2Continue = new Scanner(System.in);
//                System.out.print("Are you sure to continue? Y/N ");
//                String confirmInput = confirm2Continue.nextLine();
//                boolean confirmation = confirmInput.toLowerCase().equals("y");
//                if (confirmation){
//                    if (userGradeInputed >= 99){
//                        System.out.println("Your letter garde is: A+");
//                    } else {
//                        System.out.println("Your letter garde is: A");
//                    }
//                } else {
//                    System.out.println("Thank you!");
//                }
//                break;
//            } else if (userGradeInputed <= 87 && userGradeInputed >= 80) {
//                Scanner confirm2Continue = new Scanner(System.in);
//                System.out.print("Are you sure to continue? Y/N ");
//                String confirmInput = confirm2Continue.nextLine();
//                boolean confirmation = confirmInput.toLowerCase().equals("y");
//                if (confirmation){
//                    if (userGradeInputed >= 86){
//                        System.out.println("Your letter garde is: B+");
//                    } else {
//                        System.out.println("Your letter garde is: B");
//                    }
//                } else {
//                    System.out.println("Thank you!");
//                }
//                break;
//            } else if (userGradeInputed <= 79 && userGradeInputed >= 67) {
//                Scanner confirm2Continue = new Scanner(System.in);
//                System.out.print("Are you sure to continue? Y/N ");
//                String confirmInput = confirm2Continue.nextLine();
//                boolean confirmation = confirmInput.toLowerCase().equals("y");
//                if (confirmation){
//                    if (userGradeInputed >= 78){
//                        System.out.println("Your letter garde is: C+");
//                    } else {
//                        System.out.println("Your letter garde is: C");
//                    }
//                } else {
//                    System.out.println("Thank you!");
//                }
//                break;
//            } else if (userGradeInputed <= 66 && userGradeInputed >= 60) {
//                Scanner confirm2Continue = new Scanner(System.in);
//                System.out.print("Are you sure to continue? Y/N ");
//                String confirmInput = confirm2Continue.nextLine();
//                boolean confirmation = confirmInput.toLowerCase().equals("y");
//                if (confirmation){
//                    if (userGradeInputed >= 65){
//                        System.out.println("Your letter garde is: D+");
//                    } else {
//                        System.out.println("Your letter garde is: D");
//                    }
//                } else {
//                    System.out.println("Thank you!");
//                }
//                break;
//            } else if(userGradeInputed <= 59 && userGradeInputed >= 0){
//                Scanner confirm2Continue = new Scanner(System.in);
//                System.out.print("Are you sure to continue? Y/N ");
//                String confirmInput = confirm2Continue.nextLine();
//                boolean confirmation = confirmInput.toLowerCase().equals("y");
//                if (confirmation){
//                    if (userGradeInputed >= 58){
//                        System.out.println("Your letter garde is: F+");
//                    } else {
//                        System.out.println("Your letter garde is: F");
//                    }
//                } else {
//                    System.out.println("Thank you!");
//                }
//                break;
//            } else {
//                System.out.println("Your input is not valid! Bye!");
//            }
//        } while (userGradeInputed <= 100 && userGradeInputed >= 0);
//
//
//    }
//}
