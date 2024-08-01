class Solution {
    public int countSeniors(String[] details) {
      int c=0;
      for(String i:details){
        int age=Integer.parseInt(i.substring(11,13));
        if(age>60)
          c++;
      }
      return c;
      
    }
  
}