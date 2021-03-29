package project_testpkl;

/*
Soal 2
By: Dian Slamet Saputra | SMKN 4 Bandung
Thanks to: w3schools.com & youtube :)
*/

    public class Soal_1 {
        
        public int findMaxConsecutiveOnes(int[] input) {
            int currentCount = 0;
            int max = 0;
            for (int n : input) {
                currentCount = n == 0 ? 0 : currentCount + 1;
                max = Math.max(max, currentCount);
            }
            return max;
        }
        public static void main(String[] args) {
            int[] input = {1, 1, 1, 0, 1, 1, 1};
            System.out.println("Output: " +new Soal_1().findMaxConsecutiveOnes(input));
    }
}