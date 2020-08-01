class Solution {
    public int fib(int N) {
        if (N<=1) return N;
        
        int fib_N=0;
        int fib_N_1=1;
        int fib_N_2=0;
        
        for(int i=2; i<=N; i++){
            fib_N = fib_N_1+fib_N_2;
            fib_N_2= fib_N_1;
            fib_N_1=fib_N;
            
        }
        return fib_N;  
    }
}
