public class hinhtron extends hinhhoc implements lhinhtron {
    double D;

    @Override
    public void duongkinh() {
        D = (int) (R * 2);
        System.out.println(" Đường kính: " + D);
    }

    public double chuvihinhtron() {
        C = (int) (2 * R * Math.PI);
        System.out.println(" Chu vi: " + C);
        return C;
    }

    public double dientichhinhtron() {
        S = (int) (Math.pow(R, 2) * Math.PI);
        System.out.println(" Diện tích: " + S + "\n");
        return S;
    }

}
