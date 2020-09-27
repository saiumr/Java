public class Conmethod {
    public static void main(String[] args) {
        Person someone = new Person("yiteng");
        System.out.println(someone.getName() + ":" + someone.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this(name, 18); // 调用另一个构造方法Person(String, int)
    }

    public Person() {
        this("Unnamed"); // 调用另一个构造方法Person(String)
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}