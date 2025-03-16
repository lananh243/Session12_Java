package Bai6;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new PartTimeEmployee("Nguyễn Văn A", 23, 2000,4),
                new FullTimeEmployee("Trần Thị B", 25, 3000,1200),
                new Intern("Nguyễn Văn C",26, 2500)
        };

        for (Employee employee : employees) {
            employee.calculateSalary();
            employee.showInfo();
        }
    }
}
