package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    static Scanner scan = new Scanner(System.in);
    static boolean seeMore = true;
    public static void main(String[] args) {
       HashMap<String, Student> students = new HashMap<>();
       Student a = new Student("a");
       Student b = new Student("b");
       Student c = new Student("c");
       Student d = new Student("d");
       a.addGrade(100);
       a.addGrade(100);
       a.addGrade(100);
       b.addGrade(80);
       b.addGrade(80);
       b.addGrade(80);
       c.addGrade(70);
       c.addGrade(70);
       c.addGrade(70);
       d.addGrade(60);
       d.addGrade(60);
       d.addGrade(60);
       students.put("Gita",a);
       students.put("Gitb",b);
       students.put("Gitc",c);
       students.put("Gitd",d);
        System.out.println("Welcome!");
        System.out.println("Here are the github usernames of our students:");
       for(String key : students.keySet()){
           System.out.printf("|%s|",key);
       }
        System.out.println();
       while(seeMore) {
           System.out.println("What student would you like to see more information on?");
           String userInput = scan.next();
           if (students.containsKey(userInput)) {
               System.out.printf("Name: %s - Github Username: %s%nCurrent Average: %.1f%n", students.get(userInput).getName(), userInput, students.get(userInput).getGradeAverage());
           } else {
               System.out.println("Sorry, no student found with the github username of \"" + userInput + "\".");
           }
           System.out.println("Would you like to see another student?");
           String again = scan.next();
           if (again.toLowerCase().startsWith("n")) {
               System.out.println("Goodbye, and have a wonderful day!");
               seeMore = false;
           }
       }
    }
}
