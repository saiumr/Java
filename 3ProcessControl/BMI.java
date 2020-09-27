import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Body Weight(kg): ");
        double weight = scanner.nextDouble();
        System.out.println("Enter Your height(m): ");
        double height = scanner.nextDouble();

        double bhrate = weight / (height * height);
        System.out.println("Your BHrate is: " + bhrate);

        if(bhrate < 18.5) {
            System.out.println("too low");
        } else if(bhrate < 25) {
            System.out.println("normal");
        }else if(bhrate < 28) {
            System.out.println("too weight");
        }else if(bhrate < 32) {
            System.out.println("fat");
        }else {
            System.out.println("too fat");
        }
    }
}