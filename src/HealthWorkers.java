public abstract class HealthWorkers extends Employee  {
private  String department;

    public HealthWorkers(String name, String mobilephone, int age, String cardiac_surgery) {
        super(name, mobilephone, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public abstract void examination(String examination_cause);

}
