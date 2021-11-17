public class DoubleConversionV2 {
    /**
     * Write a program that dispaly Miles to Kilometers then kilometers to Miles
     * 1-10  miles to kilometers, then 20-65 ++5 kilometers to Miles
     * */

    public static void main(String[] args) {


        System.out.println("Kilograms \tPounds\t |\t\t Pounds\t\tKilograms");

        for (int i=1,j=20; i<10 && j<=65; i++,j+=5){
            double milesToKilometers = i * 1.609;
            double kilometersToMiles = j / 1.609;
            System.out.println(i+"\t\t\t"+ String.format("%.2f",milesToKilometers)+"\t |\t\t "+ j +"\t\t\t"+ String.format("%.2f",kilometersToMiles));
        }
    }
}
