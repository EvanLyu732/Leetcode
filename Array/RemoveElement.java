class Solution {
    
    public static int removeElement(int[] nums, int val) {
          int i = 0;
          int count = nums.length;
          while (i < count) {
            if (nums[i] == val) {
                nums[i] = nums[count - 1];
                count--;
        } else {
               i++;
        }
    }
             return count;
   }

    
    public static void main(String[] args){
        int[] number ={3,2,2,3};
        int val=2;
        
        int len =removeElement(number,val);
    
        for (int i=0; i<len; i++){
             System.out.println(number[i]);
        }
    }
}
