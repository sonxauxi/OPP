public class Studentt {
    public int MSSV;
    public String name;
    public float TheoreticalScore;
    public float PracticeCore; 

    public void Mark(){
        float AverageMark = (TheoreticalScore+PracticeCore)/2;
        System.out.println("Tên: "+ name + " \nMã sinh viên: "+ MSSV);
        System.out.println("Diem so: "+AverageMark);
        
    }

    public Studentt(String name, int MSSV, float TheoreticalScore,float PracticeCore){
        this.name = name;
        this.MSSV = MSSV;
        this.TheoreticalScore = TheoreticalScore;
        this.PracticeCore = PracticeCore;
    }

	public Studentt() {
	}
}
