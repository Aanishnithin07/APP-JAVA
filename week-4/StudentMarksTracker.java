package tutorial4;

class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double getAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.length;
    }
}

public class StudentMarksTracker {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice", new int[]{85, 90, 78}),
            new Student("Bob", new int[]{88, 76, 92}),
            new Student("Charlie", new int[]{95, 89, 91})
        };

        Student topStudent = students[0];
        for (Student s : students) {
            if (s.getAverage() > topStudent.getAverage()) {
                topStudent = s;
            }
        }

        System.out.println("Top Student: " + topStudent.name + 
                           " with average " + topStudent.getAverage());
    }
}
