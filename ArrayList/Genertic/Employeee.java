import java.util.ArrayList;
import java.util.List;

public class Employeee {
    public static void main(String[] args) throws Exception {
        List<Employee> employee = new ArrayList<Employee>();
        Waiter waiter = new Waiter();
        Kitchen Kitchen = new Kitchen();
        for (int i = 0; i < 3; i++) {
            waiter.input();
            waiter.calculatorSalary();
            employee.add(waiter);
            Kitchen.input();
            Kitchen.calculatorSalary();
            employee.add(Kitchen);
        }
        printArray(employee);
    }

    public static void printArray(List<? extends Employee> lists) {
        for (Object employee : lists) {
            System.out.println(employee);
        }
    }

}
