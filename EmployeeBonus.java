import java.util.Scanner; 

class EmployeeBonus {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble(); 

       
        System.out.print("Enter your years of service: ");
        int yearsOfService = sc.nextInt(); 

        
        if (yearsOfService > 5) {
            // Calculate bonus as 5% of salary
            double bonus = salary * 0.05;
            System.out.println("bonus : " + bonus);
        } 
        else {
            System.out.println("No bonus");
        }

    }
}
