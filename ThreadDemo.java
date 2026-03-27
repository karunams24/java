import java.util.Scanner;

// ==========================================================================
// PART 1: MULTIPLICATION THREAD
// ==========================================================================

// 1. Inherit Thread class
class MultiplicationThread extends Thread {

    // 2. Override run() method
    @Override
    public void run() {

        System.out.println("-> Multiplication Thread Started.");

        try {

            // 3. Loop for table of 5
            for (int i = 1; i <= 10; i++) {

                System.out.println("5 x " + i + " = " + (5 * i));

                // 4. Pause for 200ms
                Thread.sleep(200);
            }

        } catch (InterruptedException e) { // 5. Catch exception
            System.out.println("Multiplication Thread interrupted.");
        }
    }
}

// ==========================================================================
// PART 2: PRIME NUMBER THREAD
// ==========================================================================

class PrimeThread extends Thread {

    int n;

    // Constructor to set N
    PrimeThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {

        System.out.println("-> Prime Thread Started.");

        int count = 0, num = 2;

        try {
            while (count < n) {

                if (isPrime(num)) {
                    System.out.println("Prime: " + num);
                    count++;

                    // Slow down for concurrency visibility
                    Thread.sleep(200);
                }

                num++;
            }

        } catch (InterruptedException e) {
            System.out.println("Prime Thread interrupted.");
        }
    }

    // Method to check prime
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

// ==========================================================================
// MAIN CLASS
// ==========================================================================

public class ThreadDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for number of primes
        System.out.print("Enter how many prime numbers to display: ");
        int n = sc.nextInt();

        // Create thread objects
        MultiplicationThread t1 = new MultiplicationThread();
        PrimeThread t2 = new PrimeThread(n);

        // Start both threads
        t1.start();
        t2.start();

        sc.close();
    }
}
