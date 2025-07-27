class Solution {
    public int countHillValley(int[] nums) {
        List<Integer>l=new ArrayList<>();
        l.add(nums[0]);
        for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            l.add(nums[i]);
        }
        }
        int count=0;
        for(int i=1;i<l.size()-1;i++){
            int p=l.get(i-1);
            int c=l.get(i);
            int n=l.get(i+1);
            if((c>p && c>n)||(c<p && c<n)){
                count++;
            }
        }
        return count;
        
    }
}