public class Probability53 {
    public static void main(String[] args) {
        int totalOutcomes = 8; // 2^3
        int favorable = 1; // Only one way to get all heads
        double probability = (double) favorable / totalOutcomes;
        System.out.println("Probability of all heads: " + probability);
    }
}
