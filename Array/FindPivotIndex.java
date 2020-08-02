class Solution {
    public int pivotIndex(int[] nums) {
        
        if(nums.length==0) return -1;
        
        int sum=0;
        int leftsum=0;
        int j=0;
        
        for(int i: nums)
              sum+=i;
        
        while(j<nums.length){
            if(leftsum==(sum-nums[j])) return j;
            else{
                leftsum+=nums[j];
                sum-=nums[j];
                j++;
            }
        } 
        return -1;

    }
}
