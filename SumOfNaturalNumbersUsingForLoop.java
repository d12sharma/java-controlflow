import java.util.Scanner; 

class SumOfNaturalNumbersUsingForLoop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt(); 

        // Check if the number is a natural number
        if (n >= 1) {
            int formulaSum = n * (n + 1) / 2;
            int forSum = 0;

            for (int i = 1; i <= n; i++) {
                forSum += i;
            }

            // Print the results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + forSum);

            
        }

       
    }
}
