// 空指针是一种常见错误
// java里叫做引用，两者差别不大
// 成员变量在定义时初始化能减少这类错误
public class BNullPointerException {
    public static void main(String[] args) {
        
    }
}

public class Person {
    private String name = "";  // 这样安全
}