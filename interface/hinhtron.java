import java.util.Scanner;

public class hinhtron extends hinhhoc implements lhinhtron {
    double D;
    double R;
    Scanner scanner = new Scanner(System.in);
    public void inputt(){
        System.out.println("nhap bán kính: ");
        R = scanner.nextDouble();
        
    }
    @Override
    public void duongkinh() {
        D = (int) (R * 2);
        System.out.println(" Đường kính: " + D);
    }


    public double chuvihinhtron() {
        setC((int) (2 * R * Math.PI));
        System.out.println(" Chu vi: " + getC());
        return getC();
    }

    public double dientichhinhtron() {
        setS((int) (Math.pow(R, 2) * Math.PI));
        System.out.println(" Diện tích: " + getS() + "\n");
        return getS();
    }

}
