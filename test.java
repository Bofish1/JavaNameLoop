import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        boolean x = false;

        while(x == false)
        {
            Scanner input = new Scanner(System.in);

            System.out.print("What is your first name? : ");
            String fName = input.next();

            System.out.print("Enter your last name : ");
            String lName = input.next();

            System.out.println("Your full name is "+fName+" "+lName);

            System.out.print("Would you like to play again?");
            String answer = input.next().intern();
            if (answer.equals("n"))
            {
                x = true;
            }
        }
        System.out.println("Goodbye!");
    }
}