import java.util.Scanner; 

class CheckNumberType {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  

        System.out.println("Enter the Number:");  
        int number = sc.nextInt(); // Read input number  

        // Check if the number is positive negative or zero  
        if (number > 0) {  
            System.out.println("The number " + number + " is positive.");  
        } else if (number < 0) {  
            System.out.println("The number " + number + " is negative.");  
        } else {  
            System.out.println("The number is zero.");  
        }  

         
    }  
}
