
import java.util.Scanner;

public class student extends persons {
    private double GPA;

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double gPA) {
        GPA = gPA;
    }


    @Override
    public String toString() {
        return "\nID: " + getId() + "\tName: " + getName() + "\tAge: " + getAge() + "\tAddress: " + getAddress()
                + "\tGPA:" + GPA;
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
        System.out.println("Nhập vào GPA: ");
        GPA = scanner.nextDouble();
        scanner.nextLine();

    }

}
