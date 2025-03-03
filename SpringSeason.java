import java.util.Scanner; 

class SpringSeason {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // user to enter the month
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt(); 

        // user to enter the day
        System.out.print("Enter the day (1-31): ");
        int day = sc.nextInt(); 

        // Check if the entered date falls within the Spring season 
        boolean isSpringSeason = (month == 3 && day >= 20) || 
                                 (month == 4) || 
                                 (month == 5) || 
                                 (month == 6 && day <= 20);

        // Print whether it's a Spring season or not
        if(isSpringSeason== true){
			System.out.println("It's a Spring Season");
		}
		else{
			System.out.println("It's not a Spring Season");
		}

    }
}
