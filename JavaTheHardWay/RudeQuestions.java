import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name, dog;
    int age, years;
    double weight, income, dogYears;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.print("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println( " and not per year!");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println( name + ".");

    System.out.print("What is your dog's name? ");
    dog =  keyboard.next();

    System.out.println("How old is " + dog + " ?");
    years = keyboard.nextInt();

    dogYears = years*7;

    System.out.println("WOOOF! I mean, Wow! That is " + dogYears + " in dog years!");
    System.out.println("Well, see ya!");



  }

}
// 1. Program does not blow up when putting in an integer when expecting double
  //because it will accepet either one.
// 2. Program does not blow up when entering Int or Double instead of String becuase it will accept numbers in String.
// 3.
