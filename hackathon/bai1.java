package buoi11.hakathon2;
import java.util.Scanner;
import java.util.TreeSet;

public class bai1 {
    public static void main(String[] args) throws Exception {
        TreeSet<Character> arr2 = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập bất kì để kiểm tra\nHoặc\nNhập Q hoặc q để thoát");
        while (true) {
            char n;
            n = scanner.next().charAt(0);
            // if (Character.toString(n).equals("q") || Character.toString(n).equals("Q")) {
            //     break;
            // }
            if (n == 'q' || n == 'Q') {
                break;
            }
            while (Character.isLetter(n)) {
                System.out.println(n + ": không phải số vui lòng nhập lại!");
                n = scanner.next().charAt(0);
            }
            if (Character.isDigit(n)) {
                arr2.add(n);
            }

           

        }

        
        scanner.close();
        System.out.println(arr2);
    
    }
}
