class Solution {
    public static int searchInsert(int[] nums, int target) {
        if(nums.length==0 || nums==null)
            return -1;
            
        int i=0;
        int j=nums.length-1;
        int mid=0;
        
        while(i<=j){
            mid = i+(j-i)/2;
            if(target==nums[mid])
                return mid;
            else if(target > nums[mid])
                 i=mid+1;
            else if(target < nums[mid])
                 j=mid-1;
        }
        return i;
    }
        
    public static void main(String[] args){
        int[] nums={1,3,5,6};
        int target=5;
        searchInsert(nums,target);
    }
}
