import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    printMenu();
    selection = scanner.nextInt();

    while (true) {
      if (selection == 1) {
        System.out.println("Hello Human");
        printMenu();
        selection = scanner.nextInt();
      }
      else if (selection == 2) {
        System.out.println("Apples, Bananas, Coconuts");
        printMenu();
        selection = scanner.nextInt();
      }

      else if (selection == 3) {
        System.out.println("Goodbye");
        break;
      }
    }
    scanner.close();
  }

  public static void printMenu() {
    System.out.println("____Menu____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
