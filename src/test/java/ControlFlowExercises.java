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
                System.out.println(i + " is multiples of 3 and 5");
            } else if (i % 5 == 0) {
                System.out.println(i + " is multiples of 5");
            } else if (i % 3 == 0){
                System.out.println(i + " is multiples of 3");
            } else {
                System.out.println(i);
            }
        }
    }
}
