import java.util.Scanner; 

class SumOfNaturalNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //user to enter a number
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt(); 

       
        if (n >= 1) {
            int formulaSum = n * (n + 1) / 2;
			int whileSum = 0;
            int i = 1;

            while (i <= n) {
                whileSum += i;
                i++;
            }

            // Print the results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + whileSum);

		} 
    }
}
