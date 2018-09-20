import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sandbox {
    // only works if 0 isn't a value you put in yourself. really just use ArrayList
    public static Integer realLength(int a[]){
        int length = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] != 0){
                length++;
            }
        }

        return length;
    }
    public static int[] reversedArry(int a[]){
        int[] temp = new int[a.length];
        int increment = 0;
        for(int i = a.length-1; i >= 0; i--){
                temp[increment] = a[i];
                increment++;

        }
        return temp;
    }
    public static Integer factorial(int num){
        if(num <= 1) return 1;
        return num * factorial(num-1);
    }
    public static void main(String[] args){
        int wholeNumber = 1;
        short shortNumber = 12333;
        byte bite = 0b10;
        long longNumber = 1123123123;
        float floatNumber = 1.1f;
        double doubleNumber = 1.1234;
        char charVar = 'a';
        boolean bool = true;
        String stringVar = "this is a string";
        System.out.printf("%d %d %d %d %f %f %c %b %s%n",wholeNumber,shortNumber,bite,longNumber,floatNumber,doubleNumber,charVar,bool,stringVar);
        long num = 2;
        do {
            if(num == 2){
                System.out.printf("%d%n",num);
            }
            System.out.printf("%d%n",((long) Math.pow(num,2)));
            num = (long) Math.pow(num,2);
        }while(num < 1000000);
        int[] arr = new int[15];
        System.out.println(Arrays.toString(arr));
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 12;
        int arrLength = arr.length;
        System.out.println(arrLength);
        System.out.println(realLength(arr));
        System.out.println(factorial(4));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reversedArry(arr)));
        }

    }

