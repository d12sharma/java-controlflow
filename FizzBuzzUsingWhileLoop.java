import java.util.Scanner; 
class FizzBuzzUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt(); 

        if (number > 0) { // Check if the number is a positive integer
            int i = 1; 
            while (i <= number) { 
                if (i % 3 == 0 && i % 5 == 0) { // Check if divisible by both 3 and 5
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) { // Check if divisible by 3
                    System.out.println("Fizz");
                } else if (i % 5 == 0) { // Check if divisible by 5
                    System.out.println("Buzz");
                } else {
                    System.out.println(i); // Print the number if not divisible by 3 or 5
                }
                i++; // Increment counter
            }
        } else {
            System.out.println("Please enter a valid positive integer."); 
        }
     
    }
}
