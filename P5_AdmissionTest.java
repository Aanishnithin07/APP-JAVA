package tutorial6;

class Admission {
 public void admissionProcess() {
     System.out.println("Admission process depends on program type.");
 }
}

class UndergraduateAdmission extends Admission {
 @Override
 public void admissionProcess() {
     System.out.println("Undergraduate Admission: Merit + Entrance Test");
 }
}

class PostgraduateAdmission extends Admission {
 @Override
 public void admissionProcess() {
     System.out.println("Postgraduate Admission: Written Test + Interview");
 }
}

public class P5_AdmissionTest {
 public static void main(String[] args) {
     Admission a1 = new UndergraduateAdmission();
     Admission a2 = new PostgraduateAdmission();

     a1.admissionProcess();
     a2.admissionProcess();
 }
}
