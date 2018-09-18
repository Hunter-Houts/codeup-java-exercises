import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args){
//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }
//        int j = 100;
//        do {
//            System.out.printf(j + "%n%n");
//            j -= 5;
//
//        } while(j >= -10);
        for(int i = 5; i <= 15; i++){
            System.out.println(i);
        }
        for(int j = 100; j >= -10; j-=5){
            System.out.printf(j + "%n%n");
        }

        for(int k = 1; k <= 100; k++){
                if(k % 15 == 0){
                    System.out.println("FizzBuzz");
                } else if (k % 3 == 0){
                    System.out.println("Fizz");
                } else if (k % 5 == 0){
                    System.out.println("Buzz");
                } else {
                    System.out.println(k);
                }
            }
            Scanner s = new Scanner(System.in);
            System.out.print("What number would you like to go up to?");
            int userNumber = s.nextInt();
            System.out.println("Here is your table!");
            System.out.println();
            System.out.println("Number | Squared | Cubed");
            System.out.println("------ | ------- | -----");
            if (userNumber < 1291) {
                for (int i = 1; i <= userNumber; i++) {
                    if ((int) Math.pow(i, 2) < 10) {
                        System.out.printf("%d      | %s       | %s    %n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
                    } else if ((int) Math.pow(i, 2) < 100) {
                        System.out.printf("%d      | %s      | %s    %n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
                    } else if ((int) Math.pow(i, 2) < 1000) {
                        System.out.printf("%d     | %s     | %s    %n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
                    } else if ((int) Math.pow(i, 2) < 10000) {
                        System.out.printf("%d     | %s    | %s    %n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
                    } else if ((int) Math.pow(i, 2) < 100000) {
                        System.out.printf("%d    | %s   | %s    %n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
                    } else if ((int) Math.pow(i, 2) < 1000000) {
                        System.out.printf("%d    | %s  | %s    %n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
                    } else {
                        System.out.printf("%d   | %s | %s    %n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
                    }
                }
            } else {
                System.out.println("Number too big");
            }
            System.out.print("Enter your grade (0-100): ");
            int userGrade = s.nextInt();
            if(userGrade < 88 && userGrade >= 80){
                System.out.println("Your grade is a B");
            } else if(userGrade < 80 && userGrade >= 67){
                System.out.println("Your grade is a C");
            } else if (userGrade < 67 && userGrade >= 60){
                System.out.println("Your grade is a D");
            } else if (userGrade < 60){
                System.out.println("Your grade is a F");
            } else {
                System.out.println("Your grade is an A");
            }
        }
    }

