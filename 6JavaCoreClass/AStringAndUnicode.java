// 从表面上看，两个字符串用==和equals()比较都为true
// 但实际上那只是Java编译器在编译期，会自动把所有相同的字符串当作一个对象放入常量池，自然s1和s2的引用就是相同的。

public class AStringAndUnicode {
    public static void main(String[] args) {
        String s1 = "hello";
        String s3 = " hello      ";
        // String s2 = "hello";
        String s2 = new String(new char[] {'H', 'E', 'L', 'L', 'O'}).toLowerCase();
        System.out.println(s1 == s2);  // false
        System.out.println(s1.equals(s2));  // true
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println(s1.contains("ell"));  // true
        System.out.println(s1.indexOf("l"));  // 2
        System.out.println(s1.lastIndexOf("l"));  // 3
        System.out.println(s1.startsWith("he"));  // true
        System.out.println(s1.endsWith("lo"));  // true
        System.out.println(s1.substring(2));  // “llo”
        System.out.println(s1.substring(2, 4));  // "ll"
        System.out.println(s3.trim());  // "hello
        // System.out.println(s3.strip());  java8无
        // "".isEmpty(); // true，因为字符串长度为0
        // "  ".isEmpty(); // false，因为字符串长度不为0
        // "  \n".isBlank(); // true，因为只包含空白字符
        // " Hello ".isBlank(); // false，因为包含非空白字符
        
        s1.replace('l', 'w'); // "hewwo"，所有字符'l'被替换为'w'
        s1.replace("ll", "~~"); // "he~~o"，所有子串"ll"被替换为"~~"
        String s = "A,,B;C ,D";  // 正则表达式替换
        s.replaceAll("[\\,\\;\\s]+", ","); // "A,B,C,D"

        s = "A,B,C,D";
        String[] ss = s.split("\\,"); // {"A", "B", "C", "D"}

        // 类型转换
        String.valueOf(123); // "123"
        String.valueOf(45.67); // "45.67"
        String.valueOf(true); // "true"
        String.valueOf(new Object()); // 类似java.lang.Object@636be97c

        int n1 = Integer.parseInt("123"); // 123
        int n2 = Integer.parseInt("ff", 16); // 按十六进制转换，255

        
    }
}