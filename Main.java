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

    // switch case example
    // get the user choice between 1 and 5
    System.out.println("Please make a selection (1-5)");

    
    int choice = input.nextInt();
    // gets rid of the enter key so we can get strings
    input.nextLine();

    // determine which candy to drop
    switch (choice){
      case 1:
        System.out.println ("Here is your chocolate bar");
        break;
      case 2:
        System.out.println("Here are your Skittles");
        break;
      case 3: 
        System.out.println("Here are your M&Ms");
        break;
      default:
        System.out.println("Invalid Choice");
    }
    
    
    // nested loop example
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
