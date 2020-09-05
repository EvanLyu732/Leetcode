class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         //sliding window
         int k=1;
         int start=0;
         int max=0;
         int zeroCount=0;
        
         for(int end=0; end< nums.length; end++){
             
             if(nums[end]==0){
                 zeroCount++;
             }
             
             while(zeroCount > k){
                 
                 if(nums[start]==0){
                     zeroCount--;
                 }
                 
                 start++;
             }
             
             max= Math.max(max,end-start+1);
         }
      
         return max;
    }
}
