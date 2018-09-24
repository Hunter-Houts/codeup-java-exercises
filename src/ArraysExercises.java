import java.util.Arrays;
public class ArraysExercises {
    static Person[] addPerson(Person[] o, Person newPerson){
        Person[] temp = new Person[o.length + 1];
        for(int i = 0; i < o.length; i++){
            temp[i] = o[i];
        }
        temp[temp.length -1] = newPerson;
        return temp;

    }
    public static void main(String[] args) {
//        What happens when you run the following code? Why is Arrays.toString necessary?
//          It gives the location of the array in memory but doesn't print the array as a string in soutprintln.
//          Arrays.toString isn't necessary, but without it you'll need to traverse each element in the array then print them individually.
//
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
    Person[] Persons =  new Person[3];
    Persons[0] = new Person("Person1");
    Persons[1] = new Person("Person2");
    Persons[2] = new Person("Person3");
    for(Person person: Persons) System.out.println(person.getName());
    System.out.println(Arrays.toString(Persons));
    System.out.println(Arrays.toString(addPerson(Persons,new Person("PersonAdd"))));




    }
}
