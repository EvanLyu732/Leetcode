class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length-1;
        int i=0;
        
        while(i<n){
            if(bits[i]==0) i+=1;
            else  i+=2;   
        }
        return i==n;
        
    }
}
