class Solution {
    public int[] sortedSquares(int[] A) {
        int[] store=new int[A.length];
        
        for(int i=0; i<A.length; i++)
            store[i]= A[i]*A[i];
        
        Arrays.sort(store);
        return store;
        
    }
}
