package codespace.workB25.task1;

public class MyCalculate {
    private static final int FOUR = 4;

    public static double calcPi(int n) {
        double result = 0.0;
        double denominator = 1;
        int one = 1;
        for (int i = 0; i < n; i++, denominator += 2) {
            result += FOUR / denominator * one;
            one = -one;
        }
        return result;
    }
}
