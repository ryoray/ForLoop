package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000, 3));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000, 4));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000, 5));

        System.out.println("===============================");

        //for(init; termination; increment){
        //
        //}

        for (int i=0; i<5; i++) {
//            System.out.println("Loop "+i+ " Hello!");
            System.out.println("10,000 at "+ i + "% interest = "+ calculateInterest(10000,i));
        }

        System.out.println("===============================");

        System.out.println(isPrime(7));

        System.out.println("===============================");
        int count = 0;
        for (int i=0; i<=30; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("The number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime (int n) {
        if (n < 1 || n == 1) {
            return false;
        }

        for (int i=2; i<=n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
