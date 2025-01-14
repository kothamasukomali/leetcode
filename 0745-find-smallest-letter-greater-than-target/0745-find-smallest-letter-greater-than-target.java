class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0;
        int r=letters.length-1;
        if(target>=letters[r]){
            return letters[l];
        }
        while(l<=r){
            int mid=(l+r)/2;
            if(target<letters[mid]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return letters[l];
    }
}