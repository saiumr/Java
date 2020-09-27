public class Ejicheng {
    public static void main(String[] args) {
        Student ai = new Student("yiteng", 88, 18);
        System.out.println(ai.getName() + ":" + ai.getAge() + "  " + ai.getScore());
    }
}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this(name, 18); // 调用另一个构造方法Person(String, int)
    }

    public Person() {
        this("yiteng"); // 调用另一个构造方法Person(String)
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person {
    private int score;

    public Student(String name, int score, int age) {
        // 
        // super("lalala");
        super("meizi", 20);
        this.score = score;
        super.name = name;
        super.age = age;
    }

    public int getScore() {
        return score;
    }
}