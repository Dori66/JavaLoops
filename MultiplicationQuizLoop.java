import java.util.Scanner;

public class MultiplicationQuizLoop {
    /**
     * Write a program that will ask the user to find 5 random mutiply operations.
     * And then display the correct and wrong answers,
     * If the answer is corret add a point to the user, and then display the total points gathered.
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userPick = 0;
        int countPoints = 0;
        int countOperations = 0;

        while (countOperations < 5){
            int numberOne = (int) (Math.random() * 10);
            int numberTwo = (int) (Math.random() * 10);
            int result = numberOne * numberTwo;


            System.out.print(numberOne +" * "+ numberTwo+" = ");
            userPick = scanner.nextInt();
            if (userPick == result){
                countPoints++;
                System.out.println("Correct!");
            }else {
                System.out.println("Wrong!");
            }
            countOperations++;
        }
        System.out.println("Total points: "+countPoints);
    }
}
