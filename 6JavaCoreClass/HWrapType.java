import java.lang.Integer;

public class HWrapType {
    public static void main(String[] args) {
        // 因为 int 和 Integer 之间可以相互转化
        // java编译器（在编译阶段）帮忙, 可以在他们之间直接进行类型转换, 目的是为了少写代码
        // 自动装箱(Auto Boxing)
        Integer k = 100;
        // 自动拆箱
        // 拆箱可能会报错，比如Ingeter=null，因为基本类型int不能为null而报错
        int n = k;

        int i = 100;
        // 通过new操作符创建Integer实例(不推荐使用,会有编译警告):
        Integer n1 = new Integer(i);
        // 通过静态方法valueOf(int)创建Integer实例:
        Integer n2 = Integer.valueOf(i);
        // 通过静态方法valueOf(String)创建Integer实例:
        Integer n3 = Integer.valueOf("100");
        System.out.println(n2.intValue());
        System.out.println(n3.intValue());
        // 我们把能创建“新”对象的静态方法称为静态工厂方法。
        // Integer.valueOf()就是静态工厂方法，它尽可能地返回缓存的实例以节省内存。
        // 创建新对象时，优先选用静态工厂方法而不是new操作符。
    }
}