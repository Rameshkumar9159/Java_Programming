public class Probability55 {
    public static void main(String[] args) {
        int totalBalls = 3 + 5 + 6;
        int totalWays = combination(totalBalls, 3);
        int favorableWays = combination(3, 1) * combination(5, 1) * combination(6, 1);
        double probability = (double) favorableWays / totalWays;
        System.out.println("Probability of 1 red, 1 blue, 1 black: " + probability);
    }
    static int combination(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n - i);
        }
        for (int i = 1; i <= r; i++) {
            res /= i;
        }
        return res;
    }
}
