import java.util.*;

public class ArrayList_Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        // set initialize value
        for (int i = 0; i < 10; ++i) arr.add(i);

        // define iterator
        Iterator<Integer> it = arr.iterator();

        // printing element
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }

        // remove element by using iterator
        Iterator<Integer> itr = arr.iterator(); //new iterator
        while (itr.hasNext()) {
            if (itr.next() % 2 == 0) {
                itr.remove();
            }
        }

        System.out.println();

        // printing value
        for (int i = 0; i < arr.size(); ++i) {
            System.out.println(arr.get(i)+" ");
        }
    }
}
