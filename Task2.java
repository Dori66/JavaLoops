package CelonisExercise;

public class Task2 {
    public static void main(String[] args) {
        solution(100111);

    }

    static void solution(int N) {
        int enable_Print = N % 10;

        while (N > 0) {

            if (enable_Print == 0 && N % 10 != 0) {
                enable_Print = 1;
            } else if (enable_Print != 0) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
    }
}
