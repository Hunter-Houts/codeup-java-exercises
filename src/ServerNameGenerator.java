public class ServerNameGenerator {
    private static String[] adjectives = {"Blue","Yellow","Green","Pink","Red","Black","White","Purple","Gray","Brown"};
    private static String[] nouns = {"Car","Table","TV","Sun","Cup","Bean","Bird","Duck","Plug","Paper"};
    static String randomString(String[] s){
        double randomIndex = Math.random() * s.length-1;
        return s[(int)randomIndex];
    }
    public static void main(String[] args){
        System.out.println("Here is your server name:");
        System.out.println(randomString(adjectives) + "-" + randomString(nouns));

    }
}
