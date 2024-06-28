public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private String department;
    private int salary;

    // Declaring the default constructor
    public Employee() {

    }
    // Declaring the parameterized constructor
    public Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return (this.id+" "+this.getName()+" "+this.getDepartment()+" "+this.salary);
    }
    @Override
    public int compareTo(Employee o) {
        Employee e1 = this;
        Integer salary1 = e1.salary;
        Integer salary2 = o.salary;
        return salary1.compareTo(salary2);
    }
}
