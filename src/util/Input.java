package util;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Input {
    private static Scanner s = new Scanner(System.in);
    static String getString(){
        return s.nextLine();
    }
    public static boolean yesNo() {
        System.out.println("Enter Yes or No: ");
        boolean yesNo;
        String answer = s.next();
        if(answer.toLowerCase().startsWith("y")){
            yesNo = true;
        } else {
            yesNo = false;
        }
        return yesNo;
    }
    public static int getInt(int min, int max){
//        System.out.println("Enter a number between " + min + " and " + max + ": ");
        int userInput = s.nextInt();
        if(min <= userInput && max >= userInput){
            return userInput;
        } else {
            System.out.println("Not a valid input");
            return getInt(min,max);
        }

    }
    public static int getInt(){
//        System.out.println("Enter a whole number: ");
        String userNumber = s.next();
        try{
            Integer.valueOf(userNumber);
        } catch (NumberFormatException e){
            System.out.println("Not an Integer " + e.getMessage());
            System.out.println("Try again.");
            userNumber = s.next();
        }
        return Integer.parseInt(userNumber);
    }
    public static double getDouble(double min, double max){
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        double userInput = s.nextDouble();
        if(min <= userInput && max >= userInput){
            return userInput;
        } else {
            System.out.println("Not a valid input");
            return getDouble(min,max);
        }

    }
    public static double getDouble(){
//        System.out.println("Enter a number: ");
        String userDouble = s.next();
        try{
            Double.valueOf(userDouble);
        } catch (NumberFormatException e){
            System.out.println("Not a valid input " + e.getMessage());
            System.out.println("Try again.");
            userDouble = s.next();
        }
        return Double.parseDouble(userDouble);
    }

    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        System.out.println(getString());
        System.out.println(yesNo());
        System.out.println(getInt(1, 10));
        System.out.println(getInt());
        System.out.println(getDouble(1.0, 100.00));
        System.out.println(getDouble());
    }
}

