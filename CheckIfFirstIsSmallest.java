import java.util.Scanner; 

class CheckIfFirstIsSmallest {
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

        // Check if the first number is smaller than both the second and third numbers
        boolean checkFirstIsSmallest = (number1 < number2) && (number1 < number3);

        
        System.out.println("Is the first number the smallest? " + checkFirstIsSmallest);

        
       
    }
}
