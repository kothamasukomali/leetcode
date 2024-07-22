class Solution {
    public void moveZeroes(int[] nums) {
        int a[]=new int[nums.length];
     
        int c=0;
        int z=0;
        int nz=0;
    while(z<nums.length){
      if(nums[z]!=0){
         nums[nz]=nums[z];
           nz++;
      
       }
        else
          c++;
      z++;
      }
for(int i=nums.length-c;i<nums.length;i++)
  nums[i]=0;
        
    
    }
}