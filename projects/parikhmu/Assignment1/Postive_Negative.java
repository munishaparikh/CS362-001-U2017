import java.util.Scanner;

public class Postive_Negative

{

    public static void number(int n){
        if(n > 0)

        // To check whether the number is positive
        {

            System.out.println("The given number "+n+" is Positive");
        }


        else if(n > 0)

        // For checking whether the number is  negative
        {

            System.out.println("The given number "+n+" is Negative");
        }

        else if (n == -1)

        // For checking if the number is zero or not
        {


            System.out.println("The given number "+n+" is neither Positive nor Negative ");
        }
        else
            // If invalid number throws an error message

            System.out.println("Error");
    }
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number you want to check:");

        n = s.nextInt();

        Postive_Negative:number(n);
    }



}

