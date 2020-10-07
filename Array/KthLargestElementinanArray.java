class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(k>nums.length || nums==null){
            return -111111;
        }
        
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
