import java.util.Scanner; 

class FactorialCalculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt(); 

        // Check if the number is a positive integer
        if (number >= 0) {
            
            long factorial = 1;
            int i = number;

            
            while (i > 0) {
                factorial *= i;
                i--;
            }

            // Print the factorial
            System.out.println("Factorial of " + number + " is: " + factorial);
        } 
        else {
            System.out.println("Please enter a valid positive integer.");
        }

       
    }
}
