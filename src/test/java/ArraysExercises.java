import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        String[] Person = new String[3];
        Person[0] = "Minh";
        Person[1] = "Van";
        Person[2] = "Elena";
        for (String name : Person){
            System.out.println(name);
        }

        addPerson("Cuong");

    }

    static String[] addPerson(String[] name2Add){

        String[] moreName = new String[name2Add.length+1];
        for (int i = 0; i < name2Add.length; i++){
            moreName[i] = name2Add[i];
        }

    }

}

