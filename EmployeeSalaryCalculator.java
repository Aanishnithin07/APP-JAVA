package tutorial4;

class Employee {
    int id;
    String name;
    double[] salaries; // last 6 months

    Employee(int id, String name, double[] salaries) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
    }

    double getTotalSalary() {
        double sum = 0;
        for (double s : salaries) {
            sum += s;
        }
        return sum;
    }
}

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(1, "Alice", new double[]{3000, 3200, 3100, 3300, 3400, 3500}),
            new Employee(2, "Bob", new double[]{4000, 4200, 4100, 4300, 4400, 4500}),
            new Employee(3, "Charlie", new double[]{3800, 3900, 3700, 3600, 4000, 4100})
        };

        Employee top = employees[0];
        for (Employee e : employees) {
            if (e.getTotalSalary() > top.getTotalSalary()) {
                top = e;
            }
        }

        System.out.println("Top Earner: " + top.name + 
                           " with total salary " + top.getTotalSalary());
    }
}
