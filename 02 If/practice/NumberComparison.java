import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (a > b) System.out.println(a + " > " + b);
        else if (a == b) System.out.println(a + " = " + b);
        else System.out.println(a + " < " + b);
        scanner.close();
    }
}
