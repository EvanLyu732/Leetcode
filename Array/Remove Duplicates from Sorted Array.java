class Solution {
    public static int removeDuplicates(int[] nums) {
         int i=0;        
        
         if(nums.length==0)
             return 0;
         else{
         for(int j=1; j<nums.length; j++){
             if(nums[j]!=nums[i])
                 i++;
                 nums[i]=nums[j];
             }
         }
         return i+1;
    }
    
    
    public static void main(String[] args){
        int[] nums={1,1,2};
        int len=removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
               System.out.print(nums[i]);
       } 
    }    
}
