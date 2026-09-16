import java.util.Scanner;
public class Assignment1Program2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Gotta ask
    System.out.println("Enter a number from 2 to 9.");
    int base = scanner.nextInt();
    // I think the math is correct
    int max = (base * base * base * base) - 1;
    System.out.println("Your max number in base 10 for base" + base + " is " + max);
    System.out.println("Now input a number between 1 and " + max);
    int number = scanner.nextInt();
    // More math... hooray
    int remain = number % base;
    number = number / base;
    int remain2 = number % base;
    number = number / base;
    int remain3 = number % base;
    number = number / base;
    int remain4 = number % base;
    number = number / base;
    // And Done!!!
    System.out.println(remain4 + "" + remain3 + "" + remain2 + "" + remain);
  }
}