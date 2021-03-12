public class hinhchunhat extends hinhhoc implements lhinhchunhat {
    double c;

    @Override
    public double duongcheo() {
        c = (int) (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        System.out.println(" Đường chéo: " + c);
        return c;
    }

    public double chuvichunhat() {
        P = (int) ((double) (a + b) * 2);
        System.out.println(" Chu vi: " + P);
        return P;
    }

    public double dientichchunhat() {
        setS2((int) ((double) a * b));
        System.out.println(" Diện tích: " + getS2());
        return getS2();
    }

}
