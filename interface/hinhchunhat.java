import java.util.Scanner;

public class hinhchunhat extends hinhhoc implements lhinhchunhat {
    double c;
    int a ;
    int b ;
    Scanner scanner = new Scanner(System.in);
    public void input(){
        System.out.println("nhap canh a: ");
        a = scanner.nextInt();
        System.out.println("nhap canh b: ");
        b = scanner.nextInt();
    }

    @Override
    public double duongcheo() {
        c = (int) (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        System.out.println(" Đường chéo: " + c);
        return c;
    }

    public double chuvichunhat() {
        setP((int) ((double) (a + b) * 2));
        System.out.println(" Chu vi: " + getP());
        return getP();
    }

    public double dientichchunhat() {
        setS2((int) ((double) a * b));
        System.out.println(" Diện tích: " + getS2());
        return getS2();
    }

}
