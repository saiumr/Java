// 在抽象类中，抽象方法本质上是定义接口规范：即规定高层类的接口，从而保证所有子类都有相同的接口实现，这样，多态就能发挥出威力。
// 如果一个抽象类没有字段，所有方法全部都是抽象方法：
// abstract class Person {
//     public abstract void run();
//     public abstract String getName();
// }
// 就可以把该抽象类改写为接口：interface。
// 接口中的字段均为 public static fianl 类型; 方法均为 public 类型，所以可以不必写
public class InterfaceEx {
    public static void main(String[] argcs) {
        Bucket barrel = new WoodBucket();  // 向上转型
        barrel.hold();
        System.out.println("Poll " + barrel.poll());
        WoodBucket woodenBucket = (WoodBucket)barrel;  // 向下转型
        woodenBucket.test();
    }
}

interface Bucket {
    void hold();
    String poll();
    
    // 给接口一个具体实现方法的机会
    default String insection_bucket() {
        return "A bucket";
    }
}

class WoodBucket implements Bucket {
    @Override
    public void hold() {
        System.out.println(this.insection_bucket() + "holds water.");
    }
    public String poll() {
        return "milk";
    }

    public void test() {
        System.out.println("test");
    }

}