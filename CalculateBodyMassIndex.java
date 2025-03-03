import java.util.Scanner;

public class CalculateBodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();
        
        height /= 100;
        double bmi = weight / (height * height);
        
        System.out.println("BMI: " + bmi);
        
        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal weight");
        } else if (bmi >= 25.0 && bmi <=39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}