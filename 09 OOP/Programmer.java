class Programmer extends Employee {
    private String department = "IT";

    // default constructor
    public Programmer(String id, String name, Double salary) {
        super(id,name,salary);
    }

    // define function to get department
    public String getDepartment() {
        return this.department;
    }
}
