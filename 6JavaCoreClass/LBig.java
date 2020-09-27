import java.math.BigInteger;
import java.math.BigDecimal;
// 任意大小的整数
// 任意精度的浮点数
// https://www.liaoxuefeng.com/wiki/1252599548343744/1279768011997217
public class LBig {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("123456789012");
        BigInteger b2 = new BigInteger("233454755858");
        BigDecimal d1 = new BigDecimal("1.123400");
        BigDecimal d2 = d1.stripTrailingZeros();
        // 如果一个BigDecimal的scale()返回负数，例如，-2，表示这个数是个整数，并且末尾有2个0。
        System.out.println(b1.add(b2));
        System.out.println(d1.scale());  // 4
        System.out.println(d2.scale());  // 2
        // 比较两个bigdecimal的数时要求他们的大小和scale都相等他们才相等(用equals()方法)
    }
}