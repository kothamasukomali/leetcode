class Solution {
    public int fib(int n) {
     
       int dp[]=new int[n+1];
       if(n==1 || n==0)
        return n;
      if(dp[n]==0)
        dp[n]=fib(n-1)+fib(n-2);
      return dp[n];
      
      
    }
}