class Solution {
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;
      Stack<Integer>s=new Stack<>();
      for(int i=0;i<n;i++){
        if(s.isEmpty() || nums[s.peek()]>nums[i]){
          s.push(i);
        }
      }
      int w=0;
      for(int j=n-1;j>=0;j--){
        while(!s.isEmpty() && nums[s.peek()]<=nums[j]){
          w=Math.max(w,j-s.peek());
          s.pop();
        }
      }
      return w;
    }
}