import java.util.Scanner; 
class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // Read user input

        if (number > 1) { // Prime numbers are greater than 1
            boolean isPrime = true; // Assume number is prime

            for (int i = 2; i < number; i++) { // Loop from 2 to number-1
                if (number % i == 0) { // Check divisibility
                    isPrime = false; // Number is not prime
                    break; 
                }
            }

            if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is not a Prime Number.");
            }
        } 

    }
}
