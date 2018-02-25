public class Objective6Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    while (counter <= 20) {
      if (counter % 2 == 0) {
        System.out.print(counter + " is even\n");
      }
      else {
        System.out.print(counter + " is odd\n");
      }
      counter = counter + 1;
    }
  }
}
