package util;

public class inputTest {
    public static void main(String[] args) {
        Input test = new Input();
        System.out.println("Enter an Integer:");
        int userInt = test.getInt();
        System.out.println(userInt);
        System.out.println("Enter a number:");
        double userDouble = test.getDouble();
        System.out.println(userDouble);
    }
}
