public class Variable {
    public static void main(String[] args) {
        // define variable
        Integer x = 10, y;
        y = 5;
        System.out.println("x = " +x);
        System.err.println("y = "+y);

        String str = "my name is bankyy";
        System.out.println(str);

        // check data type
        boolean result = x instanceof Integer;
        System.out.println(result);
    }
}
