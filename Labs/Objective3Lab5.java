import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] agrs){
    double num1, num2, total;

    Scanner input = new Scanner(System.in);

    System.out.print("Please enter a number:");
    num1 = input.nextDouble();

    System.out.print("Please enter another number:");
    num2 = input.nextDouble();

    total = num1+num2;

    System.out.println("The sum of " + num1 + "+" + num2 + " is " + total);
    input.close();

  }

}
