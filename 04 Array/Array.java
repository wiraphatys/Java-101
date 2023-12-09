public class Array {
    public static void main(String[] args) {
        // declare array
        int arr[] = {1,2,3,4};
        String fruits[] = new String[3];
        fruits[0] = "tomato";
        fruits[1] = "banana";
        fruits[2] = "orange";

        // access element in array by index (for loop)
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }

        // access by for each
        for (String e : fruits) {
            System.out.println(e);
        }
    }
}
