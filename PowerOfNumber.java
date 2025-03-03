import java.util.Scanner; 
class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = sc.nextInt(); 
        System.out.print("Enter power: ");
        int power = sc.nextInt(); 

        if (number >= 0 && power >= 0) { // Check if both inputs are positive
            int result = 1; // Initialize result variable
            for (int i = 1; i <= power; i++) { // Loop to multiply number power times
                result *= number; 
            }
            System.out.println(number + "^" + power + " = " + result);
        } 
        
    }
}
