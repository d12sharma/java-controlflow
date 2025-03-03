import java.util.Scanner; 

class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Create a variable total to store the sum
        double total = 0.0;  

        // Use infinite while loop
        while (true) {
            // Prompt user to enter a number
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = sc.nextDouble(); 

            // Check if the user entered 0 or a negative number
            if (number <= 0) {
                break; // Exit the loop
            }

            // Add user input to total
            total += number;
        }

        // Print the total sum
        System.out.println("Total sum: " + total);

     
    }
}
