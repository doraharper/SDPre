import java.util.Scanner;

public class ShallowGrandmother {
  public static void main( String[] args ) {
      Scanner keyboard = new Scanner(System.in);
      int age;
      double income, cute, happiness;
      boolean allowed, allowed2;

      System.out.print("Enter your age: ");
      age = keyboard.nextInt();

      System.out.print("Enter your yearly income: ");
      income = keyboard.nextDouble();

      System.out.println("How cute are you, on a scale from 0.0 to 10.0?");
      cute = keyboard.nextDouble();

      allowed = (age > 25 && age < 40 && ( income > 50000 || cute >= 8.5 ) );

      System.out.println( "Allowed to date my grandchild? " + allowed );

      System.out.println( "How happy do you make them on a scale from 0.0 to 10.0? " );
      happiness = keyboard.nextDouble();

      allowed2 = (age > 27 && age < 37 && (happiness > 7.0 ) );

      System.out.println("Allowed to date my other awesome grandchild? " + allowed2 );
      }

}
