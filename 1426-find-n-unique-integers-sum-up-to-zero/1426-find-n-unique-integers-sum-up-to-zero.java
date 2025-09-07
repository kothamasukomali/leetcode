class Solution {
    public int[] sumZero(int n) {
        int r[]=new int[n];
        r[0]=n*(1-n)/2;
        for(int i=1;i<n;i++){
            r[i]=i;
        }
        return r;
        
    }
}