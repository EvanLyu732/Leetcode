class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //merge
        int n1=nums1.length, n2=nums2.length;
        int[] nums =new int[n1+n2];
        double median;
        
        for(int i=0; i<nums1.length; i++){
            nums[i]=nums1[i];
        }
        
        for(int i=0; i<n2;i++){
            nums[i+n1]=nums2[i];
        }
        
        //sort
        Arrays.sort(nums);
         
        //odd or even;
        //if odd -> index (n/2)+(n/2)+1
        if((n1+n2) %2==0){
            int sum=nums[(n1+n2)/2]+nums[(n1+n2)/2-1];
            median = ((double) sum)/2;
        }else{
            median=(double)nums[(n1+n2)/2];
        }
        return median;
        
    }
   
}
