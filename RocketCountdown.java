import java.util.Scanner; 

class RocketCountdown {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // user to enter the countdown start value
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt(); 

        // Countdown from the user input value to 1
        while (counter>=1) {
            System.out.println(counter);
            counter--; 
        }

    }
}
