import java.util.Scanner; 
class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt(); // Read year input

        if (year >= 1582) { 
            
             if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }

            
        } else {
            System.out.println("Enter a valid year (>= 1582)."); 
        }
        
    }
}
