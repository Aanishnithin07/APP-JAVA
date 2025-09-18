
public class q1 {
    public static void main(String[] args) {
        NumberThread t = new NumberThread();
        t.setName("NumberPrinterThread"); // Set a meaningful thread name
        t.start();
    }
}

class NumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500); // Pause for half a second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}