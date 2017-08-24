package dk.clbo;

public class Employee extends Person {


    private int hours;
    private int salary;

    public Employee(String name, String cpr, int hours, int salary) {
        super(name, cpr); // super klassens Konstruktør kaldes
        this.hours = hours;
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "hours=" + hours +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", cpr='" + cpr + '\'' +
                '}';
    }
}
