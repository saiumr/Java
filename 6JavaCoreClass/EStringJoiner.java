import java.util.StringJoiner;
// StringJoiner
// join

// 拼接字符串
public class EStringJoiner {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};
        String[] classes = {"class1", "class2", "class3"};

        StringJoiner s = new StringJoiner(", ", "Hello ", "!");  // 定界符，前缀，后缀
        for (String name: names) {
            s.add(name);
        }
        String c = String.join(", ", classes);

        System.out.println(s.toString());
        System.out.println(c);
    }
}