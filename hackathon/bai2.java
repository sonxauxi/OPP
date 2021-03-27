package buoi11.hakathon2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class bai2 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numberone = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lớn hơn 8 và nhỏ hơn 14: ");
        int x = scanner.nextInt();
        nhapN(x);
        Nphantu(x, numberone);
        System.out.println(numberone);
        System.out.println("Nhập vào số lớn hơn -10 và nhỏ hơn 10: ");
        int y = scanner.nextInt();
        chonso(y);
        System.out.println("Số vừa chọn là: " + y);
        int m = y - 1;
        int n = y + 1;
        System.out.println(" Hai số gần nhất với " + y + " là :" + m + " và " + n);
        sinhsongaunhien(y, numberone, m, n);
        scanner.close();
    }

    public static void nhapN(int x) {
        while (x <= 8 || x >= 14) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lại: ");
            x = scanner.nextInt();
        }
        System.out.println("Số vừa nhập thành công: " + x);
        
    }

    public static void Nphantu(int x, ArrayList<Integer> numberone) {

        System.out.println(x + " phần tử ngẫu nhiên từ -10 tới 10:");
        for (int i = 0; i < x; i++) {
            int number = ThreadLocalRandom.current().nextInt(-10, 10);
            numberone.add(number);
        }
    }

    public static void chonso(int y) {
        while (y <= -10 || y >= 10) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lại: ");
            y = scanner.nextInt();
        }

    }

    public static void sinhsongaunhien(int y, ArrayList<Integer> numberone, int m, int n) {
        int b;
        System.out.println("Các cặp số có tổng bằng " + m + " là: ");
        for (int i = 0; i < numberone.size(); i++) {
            b = m - numberone.get(i);
            for (int j = 0; j < numberone.size(); j++) {
                if (b == numberone.get(j)) {
                    System.out.println(b + " & " + numberone.get(i));
                } 
            }
        }

        int c;
        System.out.println("\nCác cặp số có tổng bằng " + n + " là: ");
        for (int j = 0; j < numberone.size(); j++) {
            c = n - numberone.get(j);
            for (int i = 0; i < numberone.size(); i++) {
                if (c == numberone.get(i)) {
                    System.out.println(c + " & " + numberone.get(j));
                } 
            }
        }

    }

}
