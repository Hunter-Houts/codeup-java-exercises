public class Person {
    private String name;
     Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello " + getName());
    }
// Method overloaded toString to return "Hello then get name for ArraysExercise"
//    public String toString(){
//         return "Hello " + getName();
//    }

    public static void main(String[] args) {
        Person thePerson = new Person("Hunter");
        System.out.println(thePerson.getName());
        thePerson.setName("Blue");
        System.out.println(thePerson.getName());
        thePerson.sayHello();
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}
