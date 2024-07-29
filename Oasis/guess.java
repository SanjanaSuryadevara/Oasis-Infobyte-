import java.util.Scanner;
import java.util.Random;
public class guess
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Welcome to Number Guessing Game!!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");
        int sn=r.nextInt(100)+1;
        int a=0;
        boolean gc=false;
        while(!gc)
        {
            System.out.println("Enter your Guess:");
            int g=sc.nextInt();
            sc.nextLine();
            a++;
            if(g==sn)
            {
                gc=true;
                System.out.println("Congratulations! You've guessed the number " + sn + " correctly!");
                System.out.println("Number of attempts: " + a);
            } else if (g < sn) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
            if (a == 10 && !gc) {
                System.out.println("You've reached the maximum number of attempts.");
                System.out.println("The correct number was: " + sn);
                break;
            }
            }
            sc.close();
        }

    }
