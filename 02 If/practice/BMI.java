import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (kg) ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (m) ");
        double height = scanner.nextDouble();

        double bmi = weight / (height*height);
        if (bmi < 18.50) System.out.println("ผอมกว่าเกณฑ์");
        else if (18.50 <= bmi && bmi <= 22.99) System.out.println("ปกติ");
        else if (23.00 <= bmi && bmi <= 24.99) System.out.println("น้ำหนักเกิน");
        else System.out.println("เป็นโรคอ้วน");
        System.out.print("BMI : "); System.out.printf("%.2f", bmi);
        scanner.close();
    }
}
