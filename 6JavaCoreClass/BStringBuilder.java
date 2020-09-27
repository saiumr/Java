// StringBuilder: 可变对象，可以预分配缓冲区，这样，往StringBuilder中新增字符时，不会创建新的临时对象
// 起因：String不可变，每次改变字符串都是在创建新的字符串浪费空间
// 比如循环拼接字符串
// 因此用一种高效的方式改变

public class BStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(1024);
        for (int i=0; i < 1000; ++i) {
            sb.append(',')
              .append(i);  // append()方法返回this对象可以进行链式操作
        }
        String s = sb.toString();
        System.out.println(s);
    }
}