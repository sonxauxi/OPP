
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;

public class ArrayListt {

    public static void main(String[] args) throws Exception {
        ArrayList<nhanvien> nhanvien2 = new ArrayList<nhanvien>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Số nhân viên cần nhập: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            nhanvien nhanvien1 = new nhanvien();
            System.out.println("Nhập thông tin nhân viên: ");
            nhanvien1.input();
            nhanvien2.add(nhanvien1);

        }

        System.out.println(nhanvien2);
        ArrayList<nhanvien> nhanvien3 = new ArrayList<nhanvien>();
        System.out.println("Số nhân viên cần chèn: ");
        int c = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < c; i++) {
            nhanvien nhanvien4 = new nhanvien();
            System.out.println("Nhập thông tin nhân viên: ");
            nhanvien4.input();
            nhanvien3.add(nhanvien4);
        }

        System.out.println("Nhập vị trí cần chèn: ");
        int d = Integer.parseInt(scanner.nextLine());

        while (d > n) {
            System.out.println("Vị trí chèn trong phạm vi số nhân viên nhập ban đầu: ");
            d = Integer.parseInt(scanner.nextLine());
        }

        nhanvien2.addAll(d, nhanvien3);
        System.out.println("Bạn có muốn tiếp tục chèn(Y/N):");
        String y = scanner.nextLine();
        ArrayList<nhanvien> nhanvien4 = new ArrayList<nhanvien>();

        while (y.equals("y") || y.equals("Y")) {
            System.out.println("Số nhân viên cần chèn: ");
            c = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < c; i++) {
                nhanvien nhanvien6 = new nhanvien();
                System.out.println("Nhập thông tin nhân viên: ");
                nhanvien6.input();
                nhanvien4.add(nhanvien6);
            }

            nhanvien2.addAll(d, nhanvien4);
            System.out.println("Nhập vị trí cần chèn: ");
            d = Integer.parseInt(scanner.nextLine());

            while (d > nhanvien2.size()) {
                System.out.println("Vị trí chèn trong phạm vi số nhân viên nhập ban đầu: ");
                d = Integer.parseInt(scanner.nextLine());
            }

            if (y.equals("n") || y.equals("N")) {
                System.out.println(nhanvien2);
            }

            do {
                System.out.println("Bạn có muốn tiếp tục chèn(Y/N):");
                y = scanner.nextLine();
            } while (!y.equals("y") && !y.equals("Y") && !y.equals("n") && !y.equals("N"));

        }

        System.out.println("Nhập mã nhân viên cần xóa: ");
        String id = scanner.nextLine();
        deleteId(nhanvien2, id);
        System.out.println(nhanvien2);

        System.out.println("Nhập tên nhân viên cần xóa: ");
        String name = scanner.nextLine();
        deleteName(nhanvien2, name);
        System.out.println(nhanvien2);

        System.out.println("Nhập tên nhân viên cần sửa: ");
        String editName = scanner.nextLine();
        scanner.nextLine();
        editname(nhanvien2,editName);
        System.out.println(nhanvien2);

        File nhanvien = new File("E:\\nhanvien2.txt");
        nhanvien.createNewFile();
        FileWriter newfile = new FileWriter("E:\\nhanvien2.txt");
        for (nhanvien nhanvientxt : nhanvien2) {
            newfile.write(nhanvientxt + "\n");
        }
        newfile.close();
        
        scanner.close();
    }

    public static void deleteId(ArrayList<nhanvien> nhanvienmoi, String id) {
        for (int i = 0; i < nhanvienmoi.size(); i++) {
            if (nhanvienmoi.get(i).getId().equals(id)) {
                nhanvienmoi.remove(i);
            }
        }

    }

    public static void deleteName(ArrayList<nhanvien> nhanvienmoi, String name) {
        for (int i = 0; i < nhanvienmoi.size(); i++) {
            if (nhanvienmoi.get(i).getId().equals(name)) {
                nhanvienmoi.remove(i);
            }
        }

    }

    public static void editname(ArrayList<nhanvien> nhanvienmoi, String editName){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i< nhanvienmoi.size(); i++){
            if(nhanvienmoi.get(i).getName().equals(editName)){
                System.out.print("Nhập ID: ");
                String Id = scanner.nextLine();
                System.out.print("Nhap Tên: ");
                String Name = scanner.nextLine();
                System.out.print("Nhập chức vụ: ");
                String Position = scanner.nextLine();
                System.out.print("Nhập địa chỉ: ");
                String Address = scanner.nextLine();
                System.out.print("Nhập Lương: ");
                double Salary = scanner.nextDouble();
                nhanvienmoi.get(i).setId(Id);
                nhanvienmoi.get(i).setName(Name);
                nhanvienmoi.get(i).setPosition(Position);
                nhanvienmoi.get(i).setAddress(Address);
                nhanvienmoi.get(i).setSalary(Salary);
            }
     
        }
        scanner.close();
    }
    
    

}
