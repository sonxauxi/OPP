import java.util.Scanner;

public class hinhhocmain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Thông số hình tròn: ");
        hinhtron hinhtron = new hinhtron();
        hinhtron.inputt();
        hinhtron.duongkinh();
        hinhtron.chuvihinhtron();
        hinhtron.dientichhinhtron();

        System.out.println("Thông số hình chữ nhật: ");
        hinhchunhat hinhchunhat = new hinhchunhat();
        hinhchunhat.input();
        hinhchunhat.duongcheo();
        hinhchunhat.chuvichunhat();
        hinhchunhat.dientichchunhat();
        scanner.close();
    }
}
