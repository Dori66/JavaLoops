public class SmallestN {
    /**
     * Find the smallest n such that n^2 > 12,000
     * (Positive number)
     * */


    public static void main(String[] args) {
        int smallestN = Integer.MAX_VALUE;
        for (int i=0; i< 12000; i++){
            if (i < smallestN){
                int powerValue =(int) Math.pow(i,2);
                if (powerValue > 12000){
                    smallestN = i;
                }
            }
        }
        System.out.println(smallestN);
    }
}
