public class Employee {

    private String name;
    private double salary;

    public Employee(){
        this.name = "";
        this.salary = 0;
    }

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
