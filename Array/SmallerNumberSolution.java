class Solution {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] store=new int[nums.length];
        int i=0;
        while(i<nums.length){
            int count =0;
            for(int j=0; j<nums.length; j++){
                if(nums[j] < nums[i])
                     count++;
            }
            store[i]=count;
            i++;
        }
        return store;      
    }
    
    public static void main(String[] args){
        int[] nums={8,1,2,2,3};
        smallerNumbersThanCurrent(nums);
    }
}
