import java.util.Scanner;

/**
 * The examples program for nested statements
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user if the animal has feathers
    System.out.println("Does the animal have feathers? (yes/no)");
    String featherAnswer = input.nextLine();

    // check to see the feather status
    if(featherAnswer.equals("yes")) {
      // get the feather colour
      System.out.println("What colour are the feathers? (red/blue)");
      String featherColour = input.nextLine();

      // determine what type of bird
      if(featherColour.equals("blue")) {
        System.out.println("That is a blue jay");
      } else if(featherColour.equals("red")) {
        System.out.println("That is a cardinal");
      }

      // if the user answered no
    }else{

    }
    
  }
}
