
package tutorial3;

class Employee {
    String name;
    int id;
    double salary;

    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Alice";
        e1.id = 101;
        e1.salary = 50000;

        Employee e2 = new Employee();
        e2.name = "Bob";
        e2.id = 102;
        e2.salary = 60000;

        e1.display();
        e2.display();
    }
}
