import java.util.Scanner;
import java.util.Random;
public class Assignment1Program1 {
  public static void main(String[] args) {
    // G code
    String[] G = {
      " GGGG ",
      "G    G",
      "G     ",
      "G  GGG",
      "G    G",
      "G   GG",
      " GGGG"
    };
    // B code
    String[] B = {
      "BBBBB",
      "B    B",
      "B    B",
      "BBBBB",
      "B    B",
      "B    B",
      "BBBBB"
    };
    // Printing em out
    for (int i = 0; i < G.length; i++) {
      System.out.println(G[i] + "  " + B[i]);
    }
    // Asking for the 5 characters
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your 5 character string:");
    String input = scanner.nextLine();
    // Cut it up
    input = input.substring (1, input.length() - 1);
    // And reversing it
    input = new StringBuilder(input).reverse().toString();
    // Give me the temp, can't spell so F is best you get
    System.out.println("Enter your temperature in F");
    int number = scanner.nextInt();
    number = number - 32;
    number = number * 5;
    number = number / 9;
    // And now for randomness
    Random random = new Random();
    int randomnumber = random.nextInt(32, 16385);
    // AND TIME TO PRINT
    System.out.println("Your new string is:");
    System.out.println(number + input + randomnumber);
  }
}