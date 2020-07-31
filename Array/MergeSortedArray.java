class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int f=m-1;
        int s=n-1;
        int k=nums1.length-1;
        
        for(int i=nums1.length-1; i>=0; i--){
            if(s<0){
                break;
            }
            if(f>=0 && nums1[f]>nums2[s]){
                nums1[i]=nums1[f];
                f--;
            }else{
                nums1[i]=nums2[s];
                s--;
            }
        
    }
    }
}
 
    
