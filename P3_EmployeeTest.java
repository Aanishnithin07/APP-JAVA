package tutorial6;

class Employee {
 double baseSalary = 50000;

 public void calculateSalary() {
     System.out.println("Salary calculation depends on employee type.");
 }
}

class Manager extends Employee {
 double bonus = 20000;

 @Override
 public void calculateSalary() {
     System.out.println("Manager Salary: " + (baseSalary + bonus));
 }
}

class Developer extends Employee {
 double overtimePay = 15000;

 @Override
 public void calculateSalary() {
     System.out.println("Developer Salary: " + (baseSalary + overtimePay));
 }
}

public class P3_EmployeeTest {
 public static void main(String[] args) {
     Employee e1 = new Manager();
     Employee e2 = new Developer();

     e1.calculateSalary();
     e2.calculateSalary();
 }
}
