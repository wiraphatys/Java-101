public class Main {
    public static void main(String[] args) {
        // create object with default constructor
        Employee e1 = new Employee();
        
        // use method to setup attribute of Employee
        e1.setID("001");
        e1.setName("Banky");
        e1.setSalary(20000.0);
        e1.getInfo();

        // create object with constructor
        Employee e2 = new Employee("002","Ball",30000.0);

        // get info of e2
        e2.getInfo();

        // Inheritance
        Programmer dev = new Programmer("003","WIRAPHAT YODSRI",150000.00);
        dev.getInfo();
    }
}
