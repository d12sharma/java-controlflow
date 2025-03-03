import java.util.Scanner; 

class CheckSumUntilZero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double total = 0.0;  

        // Create a variable to store user input
        System.out.print("Enter a number : ");
        double number = sc.nextDouble(); 

        // Use while loop to check if user input is not 0
        while (number != 0) {
            total += number; 
			//user to enter the next number if input is not zero
            System.out.print("Enter a number: ");
            number = sc.nextDouble(); 
        }

        // Print the total sum
        System.out.println("Total sum: " + total);

       
    }
}
