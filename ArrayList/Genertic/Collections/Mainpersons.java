import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mainpersons {
    public static void main(String[] args) throws Exception {
        ArrayList<student> students = new ArrayList<>();
        ArrayList<teacherss> teachers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            student student = new student();
            student.input();
            students.add(student);

            teacherss teacher = new teacherss();
            teacher.input();
            teachers.add(teacher);
        }
        printArray(students);
        System.out.println("\n============================================================");
        printArray(teachers);

        System.out.println("\nDanh sách học sinh theo tên: \n");
        Collections.sort(students, new Comparator<student>() {

            @Override
            public int compare(student o1, student o2) {
                return o1.getName().compareTo(o2.getName());
            }

        });
        printArray(students);

        Collections.sort(students, new Comparator<student>() {
            @Override
            public int compare(student n, student m) {
                return m.getGPA() > n.getGPA() ? 1 : -1;
            }

        });
        System.out.println("Danh sách học sinh theo GPA: ");
        printArray(students);

        System.out.println("\nTên học sinh có GPA cao nhất: " + students.get(0).getName());

        System.out.println("\nDanh sách giáo viên theo tên: \n");
        Collections.sort(teachers, new Comparator<teacherss>() {

            @Override
            public int compare(teacherss o1, teacherss o2) {
                return o1.getName().compareTo(o2.getName());
            }

        });
        printArray(students);

        Collections.sort(teachers, new Comparator<teacherss>() {
            @Override
            public int compare(teacherss n, teacherss m) {
                return m.getSalary() > n.getSalary() ? 1 : -1;
            }

        });
        System.out.println("Danh sách giáo viên xếp theo lương: ");
        printArray(students);

        System.out.println("\nGiáo viên có lương cao nhất: " + students.get(0).getName());

    }

    public static void printArray(List<? extends persons> list) {
        System.out.println(list.toString());
    }

}
