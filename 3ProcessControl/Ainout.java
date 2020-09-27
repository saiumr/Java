import java.util.Scanner;
public class Ainout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Previous Grades: ");
        int preGrades = scanner.nextInt();
        System.out.println("Please Enter Your Present Grades: ");
        int senGrades = scanner.nextInt();

        // 格式化输出必须是printf，其他的只带一个形参
        System.out.printf("Improve Rate: %.2f", (double)(senGrades - preGrades) / preGrades);
    }
}