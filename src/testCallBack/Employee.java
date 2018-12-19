package testCallBack;

public class Employee implements Texable{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double getTex() {
        return getSalary() * 0.2;
    }
}
