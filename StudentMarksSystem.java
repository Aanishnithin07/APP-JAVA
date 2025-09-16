package tutorial5;

class Student {
    private int marks;

    public void setMarks(int marks, String role) {
        if(role.equals("Teacher")) {
            this.marks = marks;
        } else {
            System.out.println("Access Denied! Only teachers can update marks.");
        }
    }

    public int getMarks(String role) {
        if(role.equals("Student") || role.equals("Teacher")) {
            return marks;
        }
        return -1;
    }
}

public class StudentMarksSystem {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setMarks(85, "Teacher");
        System.out.println("Student views marks: " + s1.getMarks("Student"));

        s1.setMarks(90, "Student");
    }
}
