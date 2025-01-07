class Solution {
    public int search(int[] a, int target) {
        int l=0;
        int r=a.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==target){
            ans= mid;
            break;
            }
            else if(a[mid]>target){
            r=mid-1;
            }
            else
            l=mid+1;
        }
        return  ans;
        
    }
}