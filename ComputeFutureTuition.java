import java.util.Scanner;

public class ComputeFutureTuition {
    /**
     * Suppose that the tuition for a university is $10,000 this year and increases 5% every year. In one year, the tuition
     * will be $10,500. Write a program that computes the tuition in ten years and the
     * total cost of four years’ worth of tuition after the tenth year.
     * */

    public static void main(String[] args) {

        double percentageGrow = 5.0;
        double tuitionPrice = 10000;
        for (int i=1; i<=10; i++){
             tuitionPrice = tuitionPrice + ((tuitionPrice *  percentageGrow) / 100.0);
            System.out.println("For Year "+i+" $10,000 tuition with 5% growth is "+ String.format("%.3f",tuitionPrice));
        }

    }
}
