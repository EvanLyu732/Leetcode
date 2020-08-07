class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length<3) return -1;
        
        int comp;
        int out;
        Arrays.sort(nums);
        
        comp=nums[0]*nums[1]*nums[nums.length-1];
        out=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        return Math.max(comp,out);
        
    }
}
