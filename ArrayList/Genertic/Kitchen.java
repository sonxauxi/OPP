import java.util.Scanner;

public class Kitchen extends Employee {
    double serviceCharge;
    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
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
            serviceCharge = scanner.nextDouble();
            scanner.nextLine();
        }
    }
    @Override
    public void calculatorSalary() {
        setSalary(getBasicSalary() + serviceCharge) ;
    }

    @Override
    public String toString() {
        return "\nID: " + getId() + "\tName: " + getName() + "\tAge: " + getAge() + "\tBasicSalary: "
                + getBasicSalary() + "\tThưởng: " + serviceCharge + "\tSalary: " + getSalary();
    }
    

}
