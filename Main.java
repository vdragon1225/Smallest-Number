import java.util.Scanner; // import Scanner

public class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); // declare scanner
      int smallestNum; // integer variable holds smallest number

      // Prompt user to enter three integers
      System.out.println("Enter three integers: ");

      smallestNum = scan.nextInt(); // set smallestNum equal to first integer

      // Use a for loop to get the next two integers
      for (int i = 0; i < 2; i++) {
        smallestNum = Math.min(smallestNum, scan.nextInt()); // use Math.min to compare smallestNum with next integer input
      }

      System.out.println("The smallest number is " + smallestNum + "."); // output smallest number

      // Close Scanner
      scan.close();
   }
}
