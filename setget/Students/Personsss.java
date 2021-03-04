
import java.util.Scanner;

public class Personsss {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Số lượng sinh viên muốn nhập: ");
        int n = scanner.nextInt();
        Personss[] Personss = new Personss[n];
        for (int i = 0; i < n; i++) {
            Personss[i] = new students();
            System.out.println("Nhập thông tin sinh viên ");  
            Personss[i].input();
        }
        for (int i = 0; i < n; i++) {
            Personss[i].display();
        }

        scanner.close();
    }
}
