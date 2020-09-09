class Solution {
    public int thirdMax(int[] nums) {
        int first_max=-999;
        int second_max=-999;
        int third_max=-999;
        
        for(Integer num: nums){
            
            if(num==first_max || num==second_max || num==third_max){
                continue;
            }
            
            if(num > first_max || first_max==-999){
                third_max=second_max;
                second_max=first_max;
                first_max=num;
            }else if(num > second_max || second_max==-999){
                third_max=second_max;
                second_max=num;
            }else if(num > third_max || third_max==-999){
                third_max=num;
            }
       }
        
        if(third_max ==-999){
            return first_max;
        }
        
        return third_max;
        
    }
}
