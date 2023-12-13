class Employee {
    // attribute
    private String id;
    private String name;
    private Double salary;

    // default constructor
    public Employee(){}

    // constructor
    public Employee(String id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // define method to set id
    public void setID(String id) {
        this.id = id;
    }

    // define method to get id
    public String getID() {
        return this.id;
    }

    // define method to set name
    public void setName(String name) {
        this.name = name;
    }

    // define method to get name
    public String getName() {
        return this.name;
    }

    // define method to set salary
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // define method to get salary
    public Double getSalary() {
        return this.salary;
    }

    // define method to get all infomation
    public void getInfo() {
        System.out.println("ID: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Salary "+this.salary);
    }
}
