class Solution {
    public int findMin(int[] nums) {
        int size = nums.length;
        
        if(nums[0]<nums[size-1]){
            return nums[0];
        }
        
        int l=0,h=size-1,mid=0;
        while(l<h){
            mid=l+(h-l)/2;
            if(nums[mid]<nums[h]){
                h=mid;
            }else{
                l=mid+1;
            }
        }
        return nums[l];
    }
}
