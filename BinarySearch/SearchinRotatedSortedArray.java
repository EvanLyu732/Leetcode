class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length==0) return -1;
        
        int left=0;
        int right=nums.length-1;
        
        //find the rotate index.
        while(left<right){
            int pivot = left+(right-left)/2;
            if(nums[pivot] > nums[right]){
                left = pivot+1;
            }else{
                right = pivot;
            }
        }
        //now both left and right on the separte index
        int start = left;
        left =0;
        right = nums.length-1;
        
        if(target >= nums[start] && target <=nums[right]){
            left =start;
        }else{
            right =start;
        }
        
        // find which side to do binary search
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
        
        
        
    }
}
