public class KEnum {
    public static void main(String[] args) {
        // 枚举类型就是一个class继承自Enum类
        // 其中每一个常量都是一个实例
        // 使用enum定义的枚举类是一种引用类型，但是可以用==比较
        // 这是因为enum类型的每个常量在JVM中只有一个唯一实例
        Weekday day = Weekday.SUN;
        if (day == Weekday.SAT || day == Weekday.SUN) {
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }

        // 返回常量名
        System.out.println(day.name());
        // 返回位序号
        System.out.println(day.ordinal());

        // 更直观显示
        System.out.println(Weekday.FRI.toString());
    }
}

enum Weekday {
    SUN(0, "星期日"), MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六");

    private final int dayValue;  // 自定义数值
    private final String chinese;

    private Weekday (int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
        //覆写toString()的目的是在输出时更有可读性。
        //注意：判断枚举常量的名字，要始终使用name()方法，绝不能调用toString()！
    }

    @Override
    public String toString() {
        return this.chinese;
    }
}