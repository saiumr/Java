// 静态字段属于所有实例“共享”的字段，实际上是属于class的字段；
// 调用静态方法不需要实例，无法访问this，但可以访问静态字段和其他静态方法；
// 静态方法常用于工具类和辅助方法。
public class Jstatic {
    public static void main(String[] args) {
        Person.setNumber(99);  // 通过类名访问
        System.out.println(Person.number);
    }
}

class Person {
    public static int number;

    public static void setNumber(int value) {
        number = value;
    }
}