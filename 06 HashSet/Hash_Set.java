import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
    public static void main(String[] args) {
        // declare empty set
        HashSet<Integer> num1 = new HashSet<>();

        // declare with initializer value
        HashSet<Integer> numbers = new HashSet<>(Set.of(5,1,3,2));

        // size() : to check size of set
        System.out.println("numbers size = "+numbers.size());

        // add(element) : add element to set
        numbers.add(100);

        // remove(element)
        numbers.remove(5);
    
        // contain(element) function to check like find() in c++
        System.out.println("is numbers has 5 in set ? : "+numbers.contains(5));
        
        // printing with for each loop
        for(int e:numbers){
            System.out.println(e);
        }
    }
}