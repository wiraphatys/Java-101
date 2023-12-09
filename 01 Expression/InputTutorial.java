import java.util.Scanner;
public class InputTutorial {
    public static void main(String[] args) {
        // ประกาศ class | new
        Scanner sc = new Scanner(System.in);
        // next = cin , nextLine = getline(cin, input)
        String name = sc.nextLine();
        System.out.println("My name is "+name);
        sc.close();
    }
}
