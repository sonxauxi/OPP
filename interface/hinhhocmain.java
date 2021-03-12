public class hinhhocmain {
    public static void main(String[] args) {
        System.out.println("Thông số hình tròn: ");
        hinhtron hinhtron = new hinhtron();
        hinhtron.duongkinh();
        hinhtron.chuvihinhtron();
        hinhtron.dientichhinhtron();

        System.out.println("Thông số hình chữ nhật: ");
        hinhchunhat hinhchunhat = new hinhchunhat();
        hinhchunhat.duongcheo();
        hinhchunhat.chuvichunhat();
        hinhchunhat.dientichchunhat();
    }
}
