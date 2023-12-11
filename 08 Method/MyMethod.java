public class MyMethod {
    public static void main(String[] args) {
        HelloWorld();

        int result = addition(10, 20);
        System.out.println(result);

        int arr[] = {10, 20, 30};
        int newArr[] = valueAdder(arr, 5);
        for (int e : newArr) System.out.print(e+" ");
    }
    static void HelloWorld(){
        System.out.println("Hello World");
    }

    static int addition(int a, int b){
        return a+b;
    }

    static int[] valueAdder(int arr[], int val) {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] += val;
        }
        return arr;
    }
}
