class Solution {
    public int[] countBits(int n) {
        if (n < 0) {
            return new int[0];
        }
        
        int[] result = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            if ((i & 1) == 0) {
                result[i] = result[i / 2];
            } else {
                result[i] = result[i - 1] + 1;
            }
        }
        
        return result;
    }
}