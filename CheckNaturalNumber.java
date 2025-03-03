import java.util.Scanner; 

class CheckNaturalNumber {
    public static void main(String[] args) {
     
        Scanner sc= new Scanner(System.in);

        
        System.out.println("Enter the Number:");
        int number=sc.nextInt(); // Read the input number

        // Check if the number is a natural number 
        if (number>=1) {
            // Calculate the sum of the first 'n' natural numbers using the formula: n * (n + 1) / 2
            int sum = number*(number + 1)/2;

            // Display the sum of 'n' natural numbers
            System.out.println("The sum of "+number+" natural numbers is :" + sum);
        } 
		else {
            // If the number is not a natural number
            System.out.println("The number "+number+" is not a natural number");
        }

        
    }
}
