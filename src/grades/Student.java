package grades;

import java.util.ArrayList;
import java.util.Map;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    protected Map<String, String> namePlusGit;
    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double getGradeAverage(){
        double total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        total = total / grades.size();
        return total;
    }

    public static void main(String[] args) {
        Student a = new Student("A");
        a.addGrade(10);
        a.addGrade(10);
        a.addGrade(12);
        System.out.println(a.grades);
        System.out.println(a.getGradeAverage());

    }
}
