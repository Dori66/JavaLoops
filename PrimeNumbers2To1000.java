public class PrimeNumbers2To1000 {

    /**
     * Write a program to display  prime numbers between 2 and 1,000, inclusive. Display eight prime numbers
     * per line. Numbers are separated by exactly one space.
     * */

    public static void main(String[] args) {

        for (int i=2; i<=1000; i++){
            for (int j=i; j > 1; j--){
                int count = 0;
                if ((i % (j-1) == 0) && ((j-1) == 1)){
                    System.out.println(i+" ");
                }else if ((i % (j-1) != 0)){
                    continue;
                }else {
                    count++;
                    if (count > 0){
                        break;
                    }
                }
            }
        }

    }
}
