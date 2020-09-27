public class FuDianShu {
    public static void main(String[] args) {
        double x = 1.0 / 10;    // 0.1
        double y = 1 - 9.0 / 10;// 0.09999999999999998

        // 由于浮点数存在运算误差，所以比较两个浮点数是否相等常常会出现错误的结果。
        // 正确的比较方法是判断两个浮点数之差的绝对值是否小于一个很小的数

        System.out.println(x);
        System.out.println(y);
    }
}