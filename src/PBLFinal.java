/**
 * Name: Ryan Monaghan
 * ID: R00115129
 */
import java.util.Scanner;
public class PBLFinal {

    public static void main(String[] args) {

        int rightFront;
        int leftFront;
        int rightRear;
        int leftRear;
        int validation = 1; 

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the tyre pressure of the front right tyre:");
        rightFront = input.nextInt();
        if (rightFront<35 || rightFront>45)
        {
            System.out.println("Warning: pressure is out of range.");
            System.out.println("");
            validation = 0;
        }

        System.out.println("Enter the tyre pressure of the front left tyre:");
        leftFront = input.nextInt();
        if (leftFront<35 || leftFront>45)
        {
            System.out.println("Warning: pressure is out of range.");
            System.out.println("");
            validation = 0;
        }

        System.out.println("Enter the tyre pressure of the rear right tyre:");
        rightRear = input.nextInt();
        if (rightRear<35 || rightRear>45)
        {
            System.out.println("Warning: pressure is out of range.");
            System.out.println("");
            validation = 0;
        }

        System.out.println("Enter the tyre pressure of the rear left tyre:");
        leftRear = input.nextInt();
        if (leftRear<35 || leftRear>45)
        {
            System.out.println("Warning: pressure is out of range.");
            System.out.println("");
            validation = 0;
        }

        if ((rightFront==leftFront && leftRear==rightRear) && validation == 1)
        {
            System.out.println("Inflation is OK.");
        }
        if (rightFront!=leftFront || leftRear!=rightRear || rightFront<35 || rightFront>45 || leftFront<35 || leftFront>45 || rightRear<35 || rightRear>45 || leftRear<35 || leftRear>45)
        {
            System.out.println("Inflation is BAD.");
        }

        input.close();

    }

}