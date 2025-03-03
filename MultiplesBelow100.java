import java.util.Scanner; 
class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt(); 

        if (number > 0 && number < 100) { 
            System.out.println("Multiples of " + number + " below 100:");
            for (int i = 100; i >= 1; i--) { // Loop from 100 to 1
                if (i % number == 0) { // Check if i is a multiple of the number
                    System.out.println(i); 
                }
            }
        } 
      
    }
}
