public class students extends Personss {
    public String ID;
    public float DTB;
    public String email;

    public students() {

    }

    @Override
    public void input() {
        System.out.print("Tên sinh viên: ");
        name = scanner.nextLine();
        System.out.println("Giới tính: ");
        gender = scanner.nextLine();
        System.out.println("Địa chỉ: ");
        address = scanner.nextLine();
        System.out.println("Date: ");
        date = scanner.nextLine();
        System.out.print("MSSV: ");
        ID = scanner.nextLine();
        System.out.print("DTB: ");
        DTB = Float.parseFloat(scanner.nextLine());
        System.out.print("Email: ");
        email = scanner.nextLine();

    }

    @Override
    public void display() {
        super.display();
        System.out.print("\tMSSV : " + ID);
        System.out.print("\tDTB : " + DTB);
        System.out.print("\tEmail : " + email);

    }

}
