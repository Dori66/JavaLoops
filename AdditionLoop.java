import java.util.Scanner;

public class AdditionLoop {
    /**
     * Write a program that will ask the user to gues the addition until it is right.
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = (int) (Math.random() * 10);
        int numberTwo = (int) (Math.random() * 10);

        int additionResult = numberOne + numberTwo;
        int userGuess = 0;

        while (userGuess != additionResult){
            System.out.print(numberOne +" + "+ numberTwo +" = ");
                userGuess = scanner.nextInt();
//                scanner.nextLine();
        }

    }
}
