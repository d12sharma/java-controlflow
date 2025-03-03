import java.util.Scanner; 

class CheckNumber { 
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in); 
        
        // Prompt user to enter a number
        System.out.println("Enter the Number:"); 
        int number = sc.nextInt(); // Read integer input
        
        // Check if the number is divisible by 5
        if (number % 5 == 0) { 
            System.out.println("Is the number " + number + " divisible by 5? Yes"); 
        } else { 
            System.out.println("Is the number " + number + " divisible by 5? No"); 
        }

        
    } 
}
