package tutorial1;

public class Incrementanddecrement {
    public static void main(String[] args) {
    	
    	
        int x = 5;

        System.out.println("Initial value of x: " + x);
        System.out.println("Post-increment (x++): " + (x++));
        System.out.println("Value of x after post-increment: " + x);

        x = 5;

        System.out.println("\nReset x to: " + x);
        System.out.println("Pre-increment (++x): " + (++x));
        System.out.println("Value of x after pre-increment: " + x);
    }
}

