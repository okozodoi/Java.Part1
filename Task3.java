package Part1;

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() { return age; }
    public String getName() { return name; }
    public void setAge(int newAge) { age = newAge; }
    public void setName(String newName) { name = newName;}

    @Override
    public String toString() {
        return "Name='" + name + "', age=" + age;
    }
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String tempName = p1.getName();
        int tempAge = p1.getAge();

        p1.setName(p2.getName());
        p1.setAge(p2.getAge());

        p2.setName(tempName);
        p2.setAge(tempAge);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Person p1 = new Person("Anna", 42);
        Person p2 = new Person("Emma", 24);

        System.out.println("Person 1 " + p1);
        System.out.println("Person 2 " + p2);

        MakingChanges.changeIdentities(p1, p2);
        System.out.println("After swapping");
        System.out.println("Person 1 " + p1);
        System.out.println("Person 2 " + p2);
    }
}
