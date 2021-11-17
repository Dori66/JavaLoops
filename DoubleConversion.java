public class DoubleConversion {
    /**
     * Write a program that dispaly kilogram to pounts then pounts to kilograms
     * 1-200 ++2 kilogram to pounds, then 20-515 ++5 pounds to kilograms
     * */

    public static void main(String[] args) {


        System.out.println("Kilograms \tPounds\t |\t\t Pounds\t\tKilograms");

        for (int i=1,j=20; i<200 && j<515; i+=2,j+=5){
            double kiloToPounds = i * 2.2;
            double pountsTOKilo = j / 2.2;
            System.out.println(i+"\t\t\t"+ String.format("%.2f",kiloToPounds)+"\t |\t\t "+ j +"\t\t\t"+ String.format("%.2f",pountsTOKilo));
        }
    }
}
