class Solution {
    public int reverse(int x) {
        long rev = 0 ;
        int sign = (x<0)?-1:1 ;
        x = Math.abs(x) ;
        while ( x>0 ) {
            int ld = x%10 ;
            rev = rev * 10 + ld ;
            x/=10 ;
        }
        rev = rev * sign;
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0 ;
        }
        return (int)rev;
    }
}