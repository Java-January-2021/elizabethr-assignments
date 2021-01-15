import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1, side2, hypotenuse;         

        System.out.print("Enter a value for Side 1: ");
        side1 = input.nextDouble();

        System.out.print("Enter a value for Side 2: ");
        side2 = input.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        System.out.println("The length of the hypotenuse is: " + hypotenuse);

    }
}
