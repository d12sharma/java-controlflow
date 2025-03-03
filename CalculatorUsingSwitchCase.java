import java.util.Scanner; 
class CalculatorUsingSwitchCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double first = sc.nextDouble(); // Read first number
        
        System.out.print("Enter second number: ");
        double second = sc.nextDouble(); // Read second number
        
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next(); // Read operator
        
        double result; // Variable to store result
        
        switch (op) { // Switch case based on operator
            case "+": 
                result = first + second; 
                System.out.println("Result: " + result);
                break;
            case "-": 
                result = first - second; 
                System.out.println("Result: " + result);
                break;
            case "*": 
                result = first * second; 
                System.out.println("Result: " + result);
                break;
            case "/": 
                 
                    result = first / second;
                    System.out.println("Result: " + result);
                
                break;
           
        }
        
        
    }
}
