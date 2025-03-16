package Bai6;

public class Intern extends Employee{
    public Intern(String name, int age, double basicSalary) {
        super(name, age, basicSalary);
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary();
    }


    @Override
    public void showInfo() {
        System.out.println("Tên nhân viên: "+getName()+ " - Tuổi nhân viên: "+getAge()+ " - Lương cơ bản: "+getBasicSalary()+ " - Lương: "+calculateSalary());
    }
}
