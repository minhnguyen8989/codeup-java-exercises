package Array;

public class ServerNameGenerator {
    private static String[] adjectives = {"happy", "sad", "angry", "funny", "silly"};
    private static String[] nouns = {"dog", "cat", "bird", "snake", "hamster"};

    public static String randomAdjective(){
        int randomIndex = (int) Math.floor(Math.random() * adjectives.length);
        return adjectives[randomIndex];
    }

    public static String randomNouns(){
        int randomIndex = (int) Math.floor(Math.random() * adjectives.length);
        return nouns[randomIndex];
    }

    public static void main(String[] args) {
        System.out.printf("The %s is very %s %n",randomNouns(), randomAdjective());
    }
}
