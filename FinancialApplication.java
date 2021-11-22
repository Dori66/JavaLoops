import java.util.Scanner;

public class FinancialApplication {

    /**
     * Write a program that lets the user enter the loan amount and loan period in number of years
     * and displays the monthly and total payments for each interest rate starting from
     * 5% to 8%, with an increment of 1/8.
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of Loan you want to get: ");
        int loanAmount = scanner.nextInt();

        System.out.print("For how many years return: ");
        int numberOfYears = scanner.nextInt();


        double annualInterestRate = 5.000;

        System.out.println("Interest Rate\t\t Monthly Payment \t\t Total Payment ");
       while (annualInterestRate != 8.000){
           double monthlyInterestRate = annualInterestRate / 1200;

           double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1/ Math.pow(1 + monthlyInterestRate,numberOfYears * 12));

           double totalPayment = monthlyPayment * numberOfYears * 12;
           monthlyPayment = (monthlyPayment * 100) / 100.0);
           System.out.print(String.format("%.3f",annualInterestRate)+"\t\t\t\t");
           System.out.println((int)(totalPayment * 100)/100.0);
           annualInterestRate += 1.0/8.0;
       }

    }
}
