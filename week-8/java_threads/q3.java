class Table5 extends Thread {
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Table10 extends Thread {
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("10 x " + i + " = " + (10 * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class q3 {
    public static void main(String[] args) {
        Table5 t5 = new Table5();
        Table10 t10 = new Table10();
        t10.start();
        t5.start();
    }
}