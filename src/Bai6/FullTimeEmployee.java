package Bai6;

public class FullTimeEmployee extends Employee{
    private double reward;

    public FullTimeEmployee(String name, int age, double basicSalary, double reward) {
        super(name, age, basicSalary);
        this.reward = reward;
    }


    @Override
    public double calculateSalary() {
        return getBasicSalary() + reward;
    }

    @Override
    public void showInfo() {
        System.out.println("Tên nhân viên: "+getName()+ " - Tuổi nhân viên: "+getAge()+ " - Lương cơ bản: "+getBasicSalary()+ " - Lương: "+calculateSalary());
    }
}
