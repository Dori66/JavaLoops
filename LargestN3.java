public class LargestN3 {
    /**
     * Find the largest n such that  n^3 < 12000)
     * */

    public static void main(String[] args) {
        int largestN = Integer.MIN_VALUE;
        for (int i=0; i< 12000; i++){
            if (i > largestN){
                int powerValue =(int) Math.pow(i,3);
                if (powerValue < 12000){
                    largestN = i;
                }
            }
        }
        System.out.println(largestN);
    }
}
