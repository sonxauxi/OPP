import java.util.Scanner;

public class Waiter extends Employee {
    double compensate;
    Scanner scanner = new Scanner(System.in);
    @Override
    public void input() {     
        System.out.println("Nhập vào ID: ");
        setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhập vào Name: ");
        setName(scanner.nextLine());
        System.out.println("Nhập vào Age: ");
        setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhập vào lương cơ bản: ");
        setBasicSalary(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Nhập vào tiền thưởng: ");
        compensate = scanner.nextDouble();
        scanner.nextLine();
     
    }

    @Override
    public void calculatorSalary() {
        setSalary(getBasicSalary() + compensate);

    }

    @Override
    public String toString() {
        return "\nID: " + getId() + "\tName: " + super.getName() + "\tAge: " + getAge() + "\tBasicSalary: "
                + getBasicSalary() + "\tThưởng" + compensate + "\tSalary: " + getSalary();
    }


}
