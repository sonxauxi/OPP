
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        File file = new File("E:\\songuyento.txt");
        file.createNewFile();
        FileWriter file1 = new FileWriter("E:\\songuyento.txt");
        while (true) {
            System.out.println("Nhập bất kì để kiểm tra\nHoặc\nNhập x hoặc q để thoát");
            String n = scanner.nextLine();

            if (n.equals("X") || n.equals("Q") || n.equals("x") || n.equals("q")) {
                break;
            }
            for (int i = 0; i < n.length(); i++) {
                while (Character.isLetter(n.charAt(i))) {
                    System.out.println(n + ": không phải số vui lòng nhập lại!");
                    n = scanner.nextLine();

                    file1.write(n + ": không phải số vui lòng nhập lại!\n");
                }
            }

            int a = Integer.parseInt(n);
            for (int j = 2; j < a; j++) {
                if (a % j == 0) {
                    System.out.println(a + ": không là số nguyên tố");
                    file1.write(a + ": không là số nguyên tố\n");
                    break;
                }
                if (a % j != 0) {
                    System.out.println(a + ": là số nguyên tố");
                    file1.write(a + ": là số nguyên tố\n");
                    break;
                }
                
            }

        }

        file1.close();
        scanner.close();
    }

}


