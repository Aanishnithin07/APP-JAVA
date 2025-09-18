class HelloThread extends Thread {
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WelcomeThread extends Thread {
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Welcome");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class q4 {
    public static void main(String[] args) {
        HelloThread hello = new HelloThread();
        WelcomeThread welcome = new WelcomeThread();
        hello.start();
        welcome.start();
    }
}