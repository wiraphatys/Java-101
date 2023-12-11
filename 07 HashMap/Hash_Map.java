import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();
        
        // size() : to check size of map
        System.out.println(stock.size());

        // put(key, value) : add element to map
        stock.put("SCB", 150);
        stock.put("PTT", 120);
        stock.put("DELTA", 700);
        stock.put("CPALL", 54);

        // get(key) : to access value
        System.out.println(stock.get("SCB"));

        // remove(key) : remove element by key
        stock.remove("CPALL");

        // printing
        for (String e : stock.keySet()) {
            System.out.println("key: "+e+" , value: "+stock.get(e));
        }
    }
}
