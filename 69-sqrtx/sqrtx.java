class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        for (int i = 2; i <= x / 2; i++) {
            long prod = (long) i * i;

            if (prod == x) 
                return i;
            else if (prod > x) 
                return i - 1;
        }

        return x / 2;
    }
}
