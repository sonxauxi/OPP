public abstract class Employee {
    private int id;
    private String name;
    private int age;
    private double basicSalary;
    private double Salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, double basicSalary, double Salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
        this.Salary = Salary ;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public abstract String toString();

    public abstract void input();
    public abstract void calculatorSalary();
     

}
