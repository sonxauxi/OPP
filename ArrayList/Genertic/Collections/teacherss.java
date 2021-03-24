import java.util.Scanner;

public class teacherss extends persons {
    private double salary;



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

 

    @Override
    public String toString() {
        return "\nID: " + getId() + "\tName: " + getName() + "\tAge: " + getAge() + "\tAddress: " + getAddress()
                + "\tSalary: " + salary;
    }
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
        System.out.println("Nhập vào Address: ");
        setAddress(scanner.nextLine());
        System.out.println("Nhập vào Salary: ");
        salary = scanner.nextDouble();
        scanner.nextLine();
    
    }

    
}
