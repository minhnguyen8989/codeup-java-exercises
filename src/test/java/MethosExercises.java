public class MethosExercises {
    public static void main(String[] args) {
        System.out.println(addition(3, 5));
        System.out.println(subtraction(6, 3));
        System.out.println(multiplication(4, 8));
        System.out.println(division(10, 2)); //Can NOT divide by zero.
        multiplicationWOLoop(1);

    }

    public static int addition(int x, int y){
        return x + y;
    }

    public static int subtraction (int x, int y){
        return x - y;
    }

    public static int multiplication (int x, int y){
        return x * y;
    }

    public static int division (int x, int y){
        return x / y;
    }

    public static void multiplicationWOLoop (int n){
        if (n >= 200){
            System.out.println("It passed 200");
            return;
        }
        multiplicationWOLoop(n + n);
        System.out.println(n);
    }
}
