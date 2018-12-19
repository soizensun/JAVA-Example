package testCallBack;

public class Main {
    public static void main(String[] args) {
        Employee kitpavin = new Employee("Kitpavin", 25000);
        Employee sirikan = new Employee("sirikan", 25555);


        Employee[] employeeArray = new Employee[2];
        employeeArray[0] = kitpavin;
        employeeArray[1] = sirikan;
        System.out.println(TexCalculator.calculateTex(employeeArray));

    }



}
