package Bai6;

public class Employee {
    private String name;
    private int age;
    private double basicSalary;

    public Employee(String name, int age, double basicSalary) {
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
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

    public double calculateSalary(){
        return 0;
    };

    public void showInfo() {
        System.out.println("Tên nhân viên: "+name+ " - Tuổi nhân viên: "+age+ " - Lương cơ bản: "+basicSalary);
    }
}
