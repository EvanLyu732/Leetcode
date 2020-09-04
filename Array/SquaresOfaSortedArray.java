class Solution {
    public int[] sortedSquares(int[] A) {
        int[] stack=new int[A.length];
        int store;
        for(int i=0; i<A.length; i++){
            store=A[i]*A[i];
            stack[i]=store;
        }
        Arrays.sort(stack);
        return stack;
    }
}
