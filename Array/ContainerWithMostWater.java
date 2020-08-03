class Solution {
    public int maxArea(int[] height) {
        
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        
        while(left<right){
            
            if(height[right]>height[left]) {
                maxarea=Math.max(maxarea, height[left]*(right-left));
                left++;
            }
            
            else {
                maxarea=Math.max(maxarea, height[right]*(right-left));
                right--;
            }           
        }
         return maxarea;
        
    }
}
