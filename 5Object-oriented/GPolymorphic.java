// Java的实例方法调用是基于运行时的"实际类型"的动态调用，而非变量的声明类型。
// 这个非常重要的特性在面向对象编程中称之为多态
// 多态是指，针对某个类型的方法调用，其真正执行的方法取决于运行时期实际类型的方法。
// 多态三要素: 继承,重写,父类引用指向子类对象

// 下面的程序输出的是son中重写的run()方法
public class GPolymorphic {
    public static void main(String[] args) {
        Father someone = new Son();
        someone.run();
    }
}

class Father {
    public void run() {
        System.out.println("Dad say Run!!!");
    }
}

class Son extends Father {
    @Override
    public void run() {
        System.out.println("Son don't want to Run!!!");
    }
}