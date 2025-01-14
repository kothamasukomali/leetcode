class Solution {
    public int countGoodSubstrings(String s) {
        int k=3;
        HashMap<Character,Integer>h=new HashMap<>();
        int l=0;
        int ans=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            h.put(ch,h.getOrDefault(ch,0)+1);
            if(r-l==3){
                char c=s.charAt(l);
                h.put(c,h.get(c)-1);
                if(h.get(c)==0){
                h.remove(c);
                  
                }
                 l+=1;
            }
         
            if(h.size()==3){
                ans+=1;
            }
         
            

        }
           return ans;
    }
        
    
}