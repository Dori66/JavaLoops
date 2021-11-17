import java.util.Scanner;

public class HighestScore {
    /**
     * Write a program that prompts the user to enter the number of students and each student’s name and score, and finally displays the name
     * of the student with the highest score.
     * */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        System.out.println("Now enter theyr names and score.");
        int highestScore = 0;
        String winner = null;
        for (int i=0; i<numberOfStudents; i++){
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Score of "+name+" : ");
            int score = scanner.nextInt();
            if (score > highestScore){
                highestScore = score;
                winner = name;
            }
        }

        System.out.println("The bigest score has "+winner +" with "+highestScore+" score");
    }





}


