import java.util.Scanner;

public class ConversionMilestoKilometers {
    /**
     * Write a program that displays  a table of Kg converted on Pounds
     * */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Miles\tKilometers");
        for (int i=1; i<=10; i++){
            double kilometers = i * 1.609;
            System.out.println(i +"\t\t\t"+String.format("%.3f", kilometers));
        }
    }
}
