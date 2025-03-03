import java.util.Scanner; 
class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt(); // Read user input

        if (number > 0) { // Check if the number is a positive integer
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i <= number; i++) { // Loop from 1 to the entered number
                if (number % i == 0) { // Check if the number is perfectly divisible by i
                    System.out.println(i); 
                }
            }
        } else {
            System.out.println("Please enter a valid positive integer."); 
        }
        
    }
}
