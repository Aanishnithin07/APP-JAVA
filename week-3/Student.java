package tutorial3;

class Student {
    int rollNo;
    String name;
    int marks;

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Ajay";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Neha";
        s2.marks = 92;

        s1.display();
        s2.display();
    }
}
