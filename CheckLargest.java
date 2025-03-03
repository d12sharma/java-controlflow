import java.util.Scanner; 

class CheckLargest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt(); 

        // Prompt user to enter the second number
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt(); 

        // Prompt user to enter the third number
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt(); 

        // Check if the first number is larger than both the second and third numbers
        boolean checkFirstIsLargest = (number1 > number2) && (number1 > number3);
		
		// Check if the second number is larger than both the third and first numbers
        boolean checkSecondIsLargest = (number2 > number3) && (number2 > number1);
		
		// Check if the third number is larger than both the second and first numbers
        boolean checkThirdIsLargest = (number3 > number2) && (number3 > number1);
		
		

        
        System.out.println("Is the first number the largest? " + checkFirstIsLargest);
		
		System.out.println("Is the second number the largest? " + checkSecondIsLargest);
		
		System.out.println("Is the third number the largest? " + checkThirdIsLargest);
		
		

        
       
    }
}
