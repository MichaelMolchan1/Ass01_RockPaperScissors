import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // var declerations
        boolean p1Done = false;
        boolean p2Done = false;
        boolean gameDone = false;
        String gameYN = "Y";
        String p1Input = "5";
        String p2Input = "5";
        Scanner in = new Scanner(System.in);
        String trash = "";
        do {
            // Player one input
            do {
                System.out.print("Player one enter your move [R P S]: ");
                if (in.nextLine().equalsIgnoreCase("R"))
                {
                    p1Input = "R";
                    p1Done = true;
                }
                else if (in.nextLine().equalsIgnoreCase("P"))
                {
                    p1Input = "P";
                    p1Done = true;
                }
                else if (in.nextLine().equalsIgnoreCase("S")) {
                    p1Input = "S";
                    p1Done = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("You must enter an integer not " + trash);
                }
            }while (!p1Done);
            // Player two input
            do {
                System.out.print("Player two enter your move [R P S]: ");
                if (in.nextLine().equalsIgnoreCase("R"))
                {
                    p2Input = "R";
                    p2Done = true;
                }
                else if (in.nextLine().equalsIgnoreCase("P"))
                {
                    p2Input = "P";
                    p2Done = true;
                }
                else if (in.nextLine().equalsIgnoreCase("S")) {
                    p2Input = "S";
                    p2Done = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("You must enter an integer not " + trash);
                }
            }while (!p2Done);

            // Test code to make sure I didn't mess up inputs
            // System.out.println(p1Input);
            // System.out.println(p2Input);

            // Compares the two players inputs to see who wins
            if (p1Input.equalsIgnoreCase("P"))
            {
                if (p2Input.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper and Paper its a tie!");
                } else if (p2Input.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper and Rock Player one wins!");
                } else if (p2Input.equalsIgnoreCase("S"))
                {
                    System.out.println("Paper and Scissors Player two wins!");
                }
            } else if (p1Input.equalsIgnoreCase("R"))
            {
                if (p2Input.equalsIgnoreCase("P"))
                {
                    System.out.println("Rock and Paper Player two wins!");
                } else if (p2Input.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock and Rock its a tie!");
                } else if (p2Input.equalsIgnoreCase("S"))
                {
                    System.out.println("Rock and Scissors Player one wins!");
                }
            } else if (p1Input.equalsIgnoreCase("S"))
            {
                if (p2Input.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors and Paper Player one wins!");
                } else if (p2Input.equalsIgnoreCase("R"))
                {
                    System.out.println("Scissors and Rock player two wins!");
                } else if (p2Input.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors and Scissors its a tie!");
                }
            }

            // Resets the booleans and then asks if the player wants to play again
            p1Done = false;
            p2Done = false;

            System.out.print("Do you want to play again? [Y/N]: ");
            gameYN = in.nextLine();
            if (gameYN.equalsIgnoreCase("N"))
            {
                gameDone = true;
                System.exit(0);  // terminate the program
            } else if (gameYN.equalsIgnoreCase("Y")) {
                gameDone = false;
            }

        }while (!gameDone);



    }
}