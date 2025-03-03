import java.util.Scanner; 

class OddEvenNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt(); 

        if (number >= 1) {
            // Iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number");
                } else {
                    System.out.println(i + " is an Odd number");
                }
            }
        } 
        else {
            System.out.println("Please enter a valid natural number.");
        }

       
    }
}
