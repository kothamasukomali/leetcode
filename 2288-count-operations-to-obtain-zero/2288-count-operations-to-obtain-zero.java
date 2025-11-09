class Solution {
    public int countOperations(int num1, int num2) {
        long a=num1,b=num2;
        int c=0;
        while(a>0 && b>0){
            if(a<b){
                long temp=a;
                a=b;
                b=temp;
            }
            c+=(int)a/b;
            a%=b;
        }
        return c;
        
    }
}