class Solution {
    public int[] arrayRankTransform(int[] arr) {
      HashMap<Integer,Integer>n=new HashMap<>();
      int m[]=Arrays.copyOf(arr,arr.length);
      Arrays.sort(m);
      int r=1;
      for(int i=0;i<m.length;i++){
        if(i>0 && m[i]>m[i-1]){
          r++;
        }
        n.put(m[i],r);
      }
      for(int i=0;i<arr.length;i++){
        arr[i]=n.get(arr[i]);
      }
      return arr;
      
        
    }
}