import java.util.Scanner;

public class CountPositiveNegative {
    /**
     * ) Write
     * a program that reads an unspecified number of integers, determines how many
     * positive and negative values have been read, and computes the total and average of
     * the input values (not counting zeros). Your program ends with the input 0. Display
     * the average as a floating-point number.
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0, positiveNumbers = 0, negativeNumbers = 0;
        int userPick = Integer.MAX_VALUE;
        while (userPick != 0){
            System.out.print("Pick a number: ");
            userPick = scanner.nextInt();
            if (userPick < 0){
                negativeNumbers++;
            }else if (userPick > 0){
                positiveNumbers++;
            }
            sumOfNumbers += userPick;
        }

        System.out.println("The sum is "+sumOfNumbers);
        System.out.println("Positive numbers: "+positiveNumbers);
        System.out.println("NegativeNumbers: "+negativeNumbers);
    }
}
