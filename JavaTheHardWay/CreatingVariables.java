public class CreatingVariables {
  public static void main(String [] args){
    int x, y, age, diapers;
    double seconds, e, checking, savings;
    String firstName, lastName, title, child;

    x = 10;
    y = 400;
    age = 39;
    diapers = 10;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    savings = 12.52;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    child = "baby";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name's " + title + " " + firstName + lastName);

    System.out.println("When a " + child + " uses about " + diapers + " diapers a day, you might have $" + savings + " in the bank at the end of the month!");
  }
}
