package tests;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Test1{
    public static void main(String[] args) {
        Person person = new Person("Alena", 25);
        System.out.println(person);
    }
}