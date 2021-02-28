import java.util.Scanner;
public class company {
    public String id;
    public String name;
    public String email;
    public String phone;
    public float salary;

    public static void main(String[] args) {
        // Nhập từ bán phím 1 đối tượng dev
        dev devv = new dev();
        Scanner scanner = new Scanner(System.in);
        String id;
        System.out.println("nhập id: ");
        id = scanner.nextLine();
        String name;
        System.out.println("Nhập tên: ");
        name = scanner.nextLine();
        String email;
        System.out.println("Nhập email: ");
        email = scanner.nextLine();
        String phone;
        System.out.println("Nhập sdt: ");
        phone = scanner.nextLine();
        float salary;
        System.out.println("Nhập lương: ");
        salary = scanner.nextFloat();

        float overtime;
        System.out.println("Nhập overtime: ");
        overtime = scanner.nextFloat();

        devv.id = id;
        devv.name = name;
        devv.email = email;
        devv.phone = phone;
        devv.salary = salary;

        // set/get của đối tượng dev, gán giá trị nhập từ scanner với thuộc tính private(overtime)
        devv.setOvertime(overtime);
        devv.salaryyy();

        scanner.close();

        // phía dưới các đối tượng còn lại mình cho giá trị tượng trưng in ra luôn cho đẹp cô ạ, không thì dài quá.
        dev dev1 = new dev();
        dev1.id = "1235";
        dev1.name = "Huyền";
        dev1.email = "huyen@gmail.com";
        dev1.phone = "0166767517";
        dev1.salary = 4500000f;

        // set/get của đối tượng dev với thuộc tính private (overtime)
        dev1.setOvertime(50.5f);

        dev1.salaryyy();

        tester tester2 = new tester();
        tester2.id = "1237";
        tester2.name = "Trung";
        tester2.email = "trung@gmail.com";
        tester2.phone = "0166721456";
        tester2.salary = 5500000f;

        // set/get của tester, thuộc tính private là error.
        tester2.setError(19);
        tester2.salaryyyy();

        tester tester1 = new tester("1236", "Ngọc ", "ngoc@gmail.com ", "0166767624", 5500000f, 16);
        tester1.salaryyyy();

    }

}

    

    




