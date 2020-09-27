class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        // A+B = -(C+D) O(N*N) time
        int count=0;
        HashMap<Integer, Integer> map = new HashMap();
        for(int a: A){
            for(int b:B){
                int sum=a+b;
                map.put(sum , map.getOrDefault(sum,0)+1);
                }
            }
        for(int c:C){
            for(int d:D){
                int cle=c+d;
                count+=map.getOrDefault(-cle,0);
            }
        }
        return count;
        
    }
}

