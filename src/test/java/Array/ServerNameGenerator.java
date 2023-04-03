package Array;

public class ServerNameGenerator {
    private String[] adjectives = {"happy", "sad", "angry", "funny", "silly"};
    private String[] nouns = {"dog", "cat", "bird", "snake", "hamster"};

    public static String randomAdjective(){
        int randomIndex = (int) Math.floor(Math.random() * 5);
        return randomAdjective()
    }

    public static String randomNouns(){
        int randomIndex = (int) Math.floor(Math.random() * 5);
        return nouns[randomIndex];
    }

    public static void main(String[] args) {
        System.out.printf("The %s is very %s %n",randomNouns(), randomAdjective());
    }
}
