import java.util.Scanner;

public class TwoHighestScores {
    /** Write a program that prompts the user to enter the
     number of students and each student’s name and score, and finally displays the
     student with the highest score and the student with the second-highest score.
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        System.out.println("Now enter theyr names and score.");
        int highestScore = 0, secondHighestScore = 0;
        String winner = null , secondWiner = null;
        for (int i=0; i<numberOfStudents; i++){
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Score of "+name+" : ");
            int score = scanner.nextInt();
            if (score > highestScore){
                secondHighestScore = highestScore;
                secondWiner = winner;
                highestScore = score;
                winner = name;

            }else if (score > secondHighestScore){
                secondHighestScore = score;
                secondWiner = name;
            }
        }

        System.out.println("The bigest score has "+winner +" with "+highestScore+" score");
        System.out.println("The second bigest score has "+secondWiner +" with "+secondHighestScore+" score");
    }
}
