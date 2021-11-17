import java.util.Scanner;

public class RepeatAddition {
    /**
     * Write a program to generate 10 random addition questions for 2 integers
     * betweem 1 and 15.Display the corrent count and test time.
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int userPick;
        int count = 0;
        int points = 0, wrongAnswers = 0;
        long startTime = System.currentTimeMillis();

        while (count < 10){
            int numberOne = (int) ((Math.random() * 15) +1);
            int numberTwo = (int) ((Math.random() * 15) +1);

            int result = numberOne - numberTwo;
            System.out.print(numberOne+" - "+numberTwo+" = ");
            userPick = scanner.nextInt();
            if (userPick == result){
                System.out.println("Correct");
                points++;
            }else {
                System.out.println("Wrong");
                wrongAnswers++;
            }
            count++;
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("You have "+points+" Correct answers and "+wrongAnswers+" Wrong answers");
        System.out.println("You finished for "+testTime/10+" seconds");



    }
}
