package Chapter2and3.BMICalculation;

import java.util.Scanner;

public class CalculateBmi {
    public static void main(String... args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double weightInKg = weight * 0.45359237;
        double heightInMeters = height * 0.0254;

        double BMI = weightInKg / Math.pow(heightInMeters, 2);

        System.out.printf("BMI is %.4f", BMI);
    }
}
