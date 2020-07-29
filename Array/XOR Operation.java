class Solution {
    public static int xorOperation(int n, int start){          
        int[] nums=new int[n];
        int output=0;
        for(int i=0; i<n;i++){
                nums[i]=start+2*i;
                output ^=nums[i];
        }
        return output;
    }
    public static void main(String[] args){
        int n=5;
        int start=0;
        xorOperation(n,start);
    }
}
