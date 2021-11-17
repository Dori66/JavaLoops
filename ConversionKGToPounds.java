import java.util.Scanner;

public class ConversionKGToPounds {
    /**
     * Write a program that displays  a table of Kg converted on Pounds
     * */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        for (int i=1; i<200; i+=2){
            double pounds = i * 2.2;
            System.out.println("Kilograms\tPounds");
            System.out.println(i +"\t\t"+String.format("%.2f", pounds));
        }
    }
}
