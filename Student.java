public class Student {
    public static void main(String[] args)throws Exception {
        Studentt studentt = new Studentt();
        studentt.MSSV = 123456;
        studentt.name = "SV1";
        studentt.TheoreticalScore = 8.5F;
        studentt.PracticeCore = 9F;

        studentt.Mark();

        Studentt studentt2 = new Studentt();
        studentt2.MSSV = 123457;
        studentt2.name = "SV2";
        studentt2.TheoreticalScore = 8F;
        studentt2.PracticeCore = 6F;

        studentt2.Mark();

        Studentt studentt3 = new Studentt();
        studentt3.MSSV = 123458;
        studentt3.name = "SV3";
        studentt3.TheoreticalScore = 8F;
        studentt3.PracticeCore = 8F;

        studentt3.Mark();

        Studentt studentt4 = new Studentt(  "SV4", 123459, 7, 8);
        studentt4.Mark();
    }
    
}
