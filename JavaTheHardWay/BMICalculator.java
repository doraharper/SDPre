import java.util.Scanner;

public class BMICalculator {
  public static void main(String [] args) {
      Scanner keyboard = new Scanner (System.in);
      double m, kg, bmi, inches, pounds, feet, inch;

      System.out.print( "Your height (feet only): ");
      feet = keyboard.nextDouble();

      System.out.print("Your height (inches only)");
      inch = keyboard.nextDouble();

      System.out.print("Your weight in pounds: ");
      pounds = keyboard.nextDouble();

      inches = (feet*12) + inch;
      m = inches*.0254;
      bmi = (pounds/2.20) / (m*m);
      System.out.println("Your BMI is " + bmi);
  }

}
