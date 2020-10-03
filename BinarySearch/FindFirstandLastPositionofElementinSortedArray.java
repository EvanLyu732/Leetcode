class Solution {
    public int[] searchRange(int[] nums, int target) {
          int[] result = new int[2];
          result[0]=findLeftIndex(nums,target);
          result[1]=findRightIndex(nums,target);
          return result;
    }
    
    public int findLeftIndex(int[] nums, int target){
        int index=-1;
        
        int start=0;
        int end=nums.length-1;
        
        while(start <=end){
            int pivot = start +(end-start)/2;
            if(nums[pivot]>=target){
                end = pivot-1;
            }else{
                start = pivot+1;
            }
            if(nums[pivot]==target) index=pivot;
        }    
        return index;
    }
    
    public int findRightIndex(int[] nums, int target){
        int index=-1;
        
        int start=0;
        int end=nums.length-1;
        
        while(start<=end){
            int pivot = start+(end-start)/2;
            
            if(nums[pivot]<=target){
                start=pivot+1;
            }else{
                end=pivot-1;
            }
            
            if(nums[pivot]==target) index=pivot;
        }
        return index;
    }
}
