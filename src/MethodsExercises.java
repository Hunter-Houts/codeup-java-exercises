import java.util.Scanner;
import java.util.Arrays;
public class MethodsExercises {
    public  static Integer add(int a, int b){
        return a + b;
    }
    public static Integer subtract(int a, int b){
        return a - b;
    }
    public static Integer multiply(int a, int b){
        return a * b;
    }
    public static Double divide(double a, double b){
        if(a == 0 || b == 0){
            return 0.0;
        }
        return a / b;
    }
    public static Integer modulo(int a, int b){
        return a % b;
    }
    public static Integer getInteger(int min, int max){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10:");
        int userInput = s.nextInt();
        if(min <= userInput && max >= userInput){
            return userInput;
        } else {
            System.out.println("Not a valid input");
            return getInteger(1,10);
        }
    }
    public static Integer Factorial(){
        int userInput = getInteger(1,10);
        int factor = 1;
        for(int i = 1; i <= userInput; i++){
            factor *= i;
        }
        return factor;
    }
    public static Integer random(int size){
        double rand = Math.floor(Math.random() * size) + 1;
        return (int) rand;
    }

    public static int[] diceRoll(){
        System.out.println("Enter number of sides for a pair of dice:");
        Scanner s2 = new Scanner(System.in);
        int size = s2.nextInt();
        int die1 = random(size);
        int die2 = random(size);
        return new int[]{die1, die2};


    }
    public static void main(String[] args){
        System.out.println(add(1,2));
        System.out.println(subtract(2,1));
        System.out.println(multiply(2,2));
        System.out.println(divide(3,3));
        System.out.println(modulo(9,3));
        int userInput = getInteger(1,10);
        System.out.println(Factorial());
        System.out.println(Arrays.toString(diceRoll()));

    }
}
