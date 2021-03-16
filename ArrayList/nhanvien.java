
import java.util.Scanner;

public class nhanvien {
    private String id;
    private String name;
    private String position;
    private String address;
    private double salary;

    public nhanvien() {
    }

    public nhanvien(String id, String name, String position, String address, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.address = address;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    Scanner scanner = new Scanner(System.in);

    public void input() {
        System.out.println("Nhập vào id: ");
        id = scanner.nextLine();
        System.out.println("Nhập vào tên: ");
        name = scanner.nextLine();
        System.out.println("Nhập vào chức vụ: ");
        position = scanner.nextLine();
        System.out.println("Nhập vào địa chỉ: ");
        address = scanner.nextLine();
        System.out.println("Nhập vào lương: ");
        salary = scanner.nextDouble();

    }

    @Override
    public String toString() {
        return  "\nTên: " + name  +"\tĐịa chỉ: " +address + "\tid: " + id+ "\tVị trí: " + position + "\tLương: "+ salary ;
    }

   
    


    
}
