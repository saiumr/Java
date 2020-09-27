// 布尔运算
public class AgeJudge {
    public static void main(String[] args) {
        int age = 7;
        // primary student的定义: 6~12岁
        boolean isPrimaryStudent = 6 <= age && age <= 12;
        System.out.println(isPrimaryStudent ? "Yes" : "No");

    }
}