class Solution {
    public int[] replaceElements(int[] arr) {
        //start from the rightside 
        int N=arr.length;
        int max_seen=0;
        int curr_max=arr[N-1];
        
        
        for(int i=N-2; i>=0 ;i--)
        {
            max_seen = Math.max(arr[i],curr_max);
            arr[i]=curr_max;
            curr_max=max_seen;

        }
        arr[N-1]=-1;
        return arr;
        
        
    }
}
