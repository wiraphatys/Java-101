import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your height (m) : ");
        double height = scanner.nextDouble();

        System.out.print("enter your weight (kg) ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height*height);
        
        System.out.println("Your BMI is " + bmi);
        scanner.close();
    }
}
