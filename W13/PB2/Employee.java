public class Employee extends Staff {
    public String office;
    public double salary;

    @Override
    public String toString() {
        return "Employee{" + "office=" + office + ", salary=" + salary + '}';
    }
    
}
