public class Objective2Lab5 {
  public static void main(String[] args) {
    double side1, side2, hypothenuse;

    side1 = 10.0;
    side2 = 8.0;

    hypothenuse = (side1 * side1) + (side2 * side2);

    System.out.println("The hypothenuse of a triangle with sides " + side1 + " and " + side2 + " is ");
    System.out.println(Math.sqrt(hypothenuse));

  }
}
