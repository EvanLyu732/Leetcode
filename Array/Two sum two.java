class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int[] output=new int[2];
        while(i<j){
            int sum=numbers[i]+ numbers[j];
            if(sum==target){
                return new int[]{i+1,j+1};
            }
            else if(sum<target)
                i++;
            else
                j--;
        }
        return new int[]{-1,-1};
    }
    
    public static void main(String[] args) {
        int[] numbers={2,7,11,15};
        int target=9;
        twoSum(numbers,target);
    }
}
