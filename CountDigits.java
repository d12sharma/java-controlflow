import java.util.Scanner; 
class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt(); 

        int count = 0; 

        if (number == 0) { // Special case for 0
            count = 1;
        } else {
            while (number != 0) { // Loop until number becomes 0
                number /= 10; 
                count++; 
            }
        }

        System.out.println("Number of digits: " + count);
        
    }
}
