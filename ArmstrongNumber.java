import java.util.Scanner; 
class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); 

        int sum = 0; // Initialize sum to zero
        int originalNumber = number; // Store the original number

        while (originalNumber != 0) { // Loop till originalNumber becomes zero
            int digit = originalNumber % 10; // Get the last digit
            sum += digit * digit * digit; // Add cube of the digit to sum
            originalNumber /= 10; 
        }

        if (sum == number) { // Check if the number is equal to the sum 
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is Not an Armstrong Number.");
        }

       
    }
}
