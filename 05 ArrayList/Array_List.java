import java.util.ArrayList;
import java.util.Collections;
public class Array_List {
    public static void main(String[] args) {
        // declare new arrayList
        ArrayList<Integer> arr = new ArrayList<Integer>();

        // add element into arrayList (like push_back in vector c++)
        arr.add(100);
        for (int i = 0; i < 10; ++i) arr.add(i);

        // checking size of arrayList
        System.out.println(arr.size());

        // sorting element
        Collections.sort(arr);

        // replace value
        arr.set(0, 20);

        // insert
        arr.add(0, 30);

        // remove
        arr.remove(arr.size()-1);

        // printing element
        for (Integer e : arr) {
            System.out.print(e+" ");
        }
    }
}
