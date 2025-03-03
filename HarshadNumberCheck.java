import java.util.Scanner; 
class HarshadNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // Read user input

        int sum = 0, temp = number; // Initialize sum and store original number

        while (temp > 0) { // Loop to get sum of digits
            sum += temp % 10; // Extract last digit and add to sum
            temp /= 10; // Remove last digit
        }

        if (number % sum == 0) { // Check if number is divisible by sum of digits
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }

        
    }
}


