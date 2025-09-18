package tutorial5;

class Patient {
    String name;
    int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class InPatient extends Patient {
    int roomNumber;

    InPatient(String name, int age, int roomNumber) {
        super(name, age);
        this.roomNumber = roomNumber;
    }

    void showRoom() {
        displayDetails();
        System.out.println("Room Number: " + roomNumber);
    }
}

class OutPatient extends Patient {
    String appointmentDate;

    OutPatient(String name, int age, String date) {
        super(name, age);
        this.appointmentDate = date;
    }

    void showAppointment() {
        displayDetails();
        System.out.println("Appointment Date: " + appointmentDate);
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        InPatient p1 = new InPatient("John", 45, 101);
        p1.showRoom();

        OutPatient p2 = new OutPatient("Alice", 30, "05-Sep-2025");
        p2.showAppointment();
    }
}
