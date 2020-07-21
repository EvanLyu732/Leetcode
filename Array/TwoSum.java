import java.util.*;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> fMap=new HashMap<>();
        int current;
        for(int i=0; i< nums.length; i++){
                current=target-nums[i];
                if(fMap.containsKey(current)){
                    return new int[]{i,fMap.get(current)};
                }
                fMap.put(nums[i],i);
         }
         return new int[]{-1,-1};
    }
        
    public static void main(String[] args){
            int[] number=new int[]{2,7,11,15};
            int target=9;
            int[] result=twoSum(number, target);
            System.out.println(result[0]+" "+result[1]);
    }

}
