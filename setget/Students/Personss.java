import java.util.Scanner;

public class Personss {
    public String name;
    public String gender;
    public String address;
    public String date;

    public Personss() {

    }

    public Personss(String name, String gender, String address, String date) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.date = date;
    }

    Scanner scanner = new Scanner(System.in);

    public void input() {
        System.out.print("Tên sinh viên: ");
        name = scanner.nextLine();
        System.out.println("Giới tính: ");
        gender = scanner.nextLine();
        System.out.println("Địa chỉ: ");
        address = scanner.nextLine();
        System.out.println("Date: ");
        date = scanner.nextLine();

    }

    public void display() {
        System.out.print("\nName: " + name + "\t Gender: " + gender + "\t Address: " + address + "\tDate: " + date);

    }

}
