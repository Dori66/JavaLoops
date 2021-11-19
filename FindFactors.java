import java.util.Scanner;

public class FindFactors {
    /**
     *  Write a program that reads an integer and displays
     * all its smallest factors in increasing order. For example, if the input integer is
     * 120, the output should be as follows: 2, 2, 2, 3, 5.
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive Integer: ");
        int userNumber = scanner.nextInt();


        int number = userNumber;
        int divideNumber = 2;
        for (int i=2; i<=userNumber; i++){ //2,3,4 ,5 , 6, 7
            if (number % divideNumber == 0){
                number /= divideNumber; // 60 , 30 , 15 , 5
                System.out.print(divideNumber+", ");// 2, 2 , 2 , 3
            }else {
                divideNumber++; // 3
            }
        }
    }
}
