class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] a = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            boolean f = false;
            a[i] = -1; // Initialize with -1, assuming no greater element is found
            
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    f = true; 
                }
                if (f && nums2[j] > nums1[i]) {
                    a[i] = nums2[j];
                    break;
                }
            }
        }
        
        return a;
    }
}
