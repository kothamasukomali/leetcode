class Solution {
    public int nthUglyNumber(int n) {
        int a[] = new int[n];
        a[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        
        for(int i = 1; i < n; i++) {
            a[i] = Math.min(a[i2] * 2, Math.min(a[i3] * 3, a[i5] * 5));
            if(a[i] == a[i2] * 2) i2++;
            if(a[i] == a[i3] * 3) i3++;
            if(a[i] == a[i5] * 5) i5++;
        }
        
        return a[n-1];
    }
}
