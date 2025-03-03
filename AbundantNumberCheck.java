import java.util.Scanner; 
class AbundantNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); 

        int sum = 0; 

        for (int i = 1; i < number; i++) { // Loop from 1 to number-1
            if (number % i == 0) { // Check if i is a divisor
                sum += i; // Add divisor to sum
            }
        }

        if (sum > number) { // Check if sum of divisors is greater than number
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }

        
    }
}
