public class CAssert {
    public static void main(String[] args) {
        double x = Math.abs(-123.45);
        assert x <= 0 : "x must >= 0";    // 断言+提示信息
        System.out.println(x);
    }
}
// 编译照常
// 执行使用 java -ea CAssert
// 断言是用来发现程序中错误的，断言失败则会直接退出程序
// 对可恢复的错误不能使用断言，而应该抛出异常
// 断言很少被使用，更好的方法是编写单元测试

