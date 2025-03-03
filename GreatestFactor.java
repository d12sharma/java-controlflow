import java.util.Scanner; 
class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt(); 

        if (number > 1) { // Check if the number is greater than 1
            int greatestFactor = 1; // Initialize greatest factor variable

            for (int i = number - 1; i >= 1; i--) { // Loop from number-1 to 1
                if (number % i == 0) { // Check if the number is perfectly divisible by i
                    greatestFactor = i; // Assign i to greatestFactor
                    break; // Exit the loop as we found the greatest factor
                }
            }
            System.out.println("Greatest factor of: " + greatestFactor);
        } else {
            System.out.println("Please enter a number greater than 1."); 
        }
        
    }
}
