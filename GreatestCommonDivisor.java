import java.util.Scanner;

public class GreatestCommonDivisor {
    /**
     * First find d
     * to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, or 1 is 
     * a divisor for both n1 and n2 in this order. The first such common divisor is the 
     * greatest common divisor for n1 and n2. Write a program that prompts the user to 
     * enter two positive integers and displays the gcd. 
     * */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number One: ");
        int numberOne = scanner.nextInt();
        System.out.print("Enter Number Two: ");
        int numberTwo = scanner.nextInt();
        
        int smallerNumber = 0, gcd = 0;
        if (numberOne <= numberTwo){
            smallerNumber = numberOne;
        }else {
            smallerNumber = numberTwo;
        }
        for (int i = smallerNumber; i >= 1; i--){
            if ((numberOne % i == 0) && (numberTwo % i == 0)){
                gcd = i;
                break;
            }
        }
        System.out.println("The greater common divisor is "+gcd);
    }
}
