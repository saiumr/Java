// 字符串不可变，字符串变量只是指向常量内存空间
public class Zifuchuan {
    public static void main(String[] args) {
        String s = "Me!";
        String t = s;
        System.out.println(t);
        s = "Changed!";
        System.out.println("t: " + t);  // 不改变
        System.out.println("s: " + s);
    }
} 