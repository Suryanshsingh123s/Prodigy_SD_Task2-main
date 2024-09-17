import java.util.Scanner;
import java.util.Random;
class GuessNumber
{
    static void game()
    {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int number= random.nextInt(100)+1;
        int x=0;
        while (true)
        {
            System.out.print("guess the number= ");
            int n= sc.nextInt();
            x++;
            if(n<=100)
            {
                if(n>number)
                {
                    System.out.println("You're wrong... guess lower");
                }
                else if(n<number)
                {
                    System.out.println("You're wrong... guess higher");
                }
                else
                {
                    System.out.println("Congratulations! You guessed the correct number!");
                    System.out.println("You have tried "+x+" times to guess the correct number.");
                    break;
                }
            }
            else
            {
                System.out.println("Invalid Input...");
                System.exit(0);
            }
        }
        System.out.print("Do you want to play again? (Yes/No)= ");
        String a= sc.next();
        a= a.toLowerCase();
        if(a.equals("yes"))
        {
            game();
        }
        else
        {
            System.exit(0);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("**GUSSING THE NUMBER**");
        System.out.println("You will have to guess number between 1 to 100");
        String accept;
        System.out.print("Do you accept the challenge? (Yes/No)=");
        accept= sc.nextLine();
        accept= accept.toLowerCase();
        while (true)
        {
            if(accept.equals("yes"))
            {
                System.out.println("Lets Start");
                game();
            }
            else if(accept.equals("no"))
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Invalid Input...");
            }
        }
    }
}