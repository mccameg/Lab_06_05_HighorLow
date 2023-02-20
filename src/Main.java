import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args)
    {
        String trash = "";
        int guess = 0;

        Random generator = new Random(); // random number generator
        int val = generator.nextInt(10) + 1; // sets generator to 1-10

        Scanner in = new Scanner(System.in); // creates new scanner and tells it to read from console

        System.out.print("Guess a number 1-10: "); // prompt
        if (in.hasNextInt()) // if the input is an integer, then the if block will run
        {
            guess = in.nextInt(); // if input is valid, it will be stored
            in.nextLine(); // clears the buffer

                System.out.println("The number was " + val); // outputs the number randomly generated

                if (guess > val) // if guess was high
                {
                    System.out.println("Your guess was too high"); //output
                }
                else if (guess < val) // if guess was low
                {
                    System.out.println("Your guess was too low"); // output
                }
                else // if guess was correct
                {
                    System.out.println("Your guess was correct!"); // output
                }
        }
        else // if an invalid entry is given, the else block will run
        {
            trash = in.nextLine(); // store invalid entry in trash
            System.out.println("Must enter a valid number 1-10: " + trash); // output to tell user that entry is invalid
        }
    }
}
