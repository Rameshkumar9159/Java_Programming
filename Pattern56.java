public class Pattern56 {
    public static void main(String[] args) {
        int num = 2;
        int[] rowCounts = {3, 5, 3, 1}; 
        int maxCount = 5; 

        for (int i = 0; i < rowCounts.length; i++) {
            
            int spaces = (maxCount - rowCounts[i]) / 2;

            for (int s = 0; s < spaces; s++) {
                System.out.print("   "); 
            }
            for (int j = 0; j < rowCounts[i]; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
