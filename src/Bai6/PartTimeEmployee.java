package Bai6;

public class PartTimeEmployee extends Employee{
    private double workingHours;

    public PartTimeEmployee(String name, int age, double basicSalary, double workingHours) {
        super(name, age, basicSalary);
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() * workingHours;
    }

    @Override
    public void showInfo() {
        System.out.println("Tên nhân viên: "+getName()+ " - Tuổi nhân viên: "+getAge()+ " - Lương cơ bản: "+getBasicSalary()+ " - Lương: "+calculateSalary());
    }
}
