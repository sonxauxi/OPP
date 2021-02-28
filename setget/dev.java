public class dev extends company {
    private float overtime;

    public dev() {

    }

    public dev(String id, String name, String email, String phone, float salary, float Overtime) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.salary = salary;

        this.overtime = Overtime;

    }

    public void salaryyy() {
        float devsalary = salary + (overtime * 200000);

        System.out.printf("%4s  %5s  %14s  %10s  %7.0f$  %5.1f h   %7.0f$\n", id, name, email, phone, salary, overtime,
                devsalary);
    }

    public void setOvertime(float overtime) {
        this.overtime = overtime;

    }

    public float getOvertime() {
        return overtime;

    }

}
