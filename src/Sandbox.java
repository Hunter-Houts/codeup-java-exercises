public class Sandbox {
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
        System.out.printf("%d %d %d %d %f %f %c %b %s",wholeNumber,shortNumber,bite,longNumber,floatNumber,doubleNumber,charVar,bool,stringVar);
        long num = 2;
        do {
            if(num == 2){
                System.out.printf("%d%n",num);
            }
            System.out.printf("%d%n",((long) Math.pow(num,2)));
            num = (long) Math.pow(num,2);
        }while(num < 1000000);
        }
    }

