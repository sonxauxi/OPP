
public class tester extends company {
    private float error;

    public tester() {

    }

    public tester(String id, String name, String email, String phone, float salary, float Error) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.salary = salary;

        this.error = Error;
    }

    public void salaryyyy() {
        float testersalary = salary + (error * 50000);
        System.out.printf("%4s  %5s  %17s  %10s  %7.0f$  %5.1f err  %7.0f$\n", id, name, email, phone, salary, error, testersalary);
    }

    public void setError(float error) {
        this.error = error;

    }

    public float getError() {
        return error;

    }

}
