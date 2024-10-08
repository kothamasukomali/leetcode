class Solution {
    public int minSwaps(String s) {
        Stack<Character>st=new Stack<>();
      int u=0;
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='[') st.push(ch);
        else{
          if(!st.isEmpty()) st.pop();
          else
            u++;
        }
      }
      return (u+1)/2;
        
    }
}