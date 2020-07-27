class Solution {
    public static int[][] transpose(int[][] A) {
        
        int cols=A.length;
        int rows=A[0].length;
        int[][] trans=new int[rows][cols];
            
        for (int i=0; i<rows; i++)
            for (int j=0; j<cols; j++){
                trans[i][j]=A[j][i];
            }            
        return trans;
    }
    
    public static void main(String args[]){
        int[][] input = {{1, 2, 3}, {4, 5,6}, {7, 8, 9}};
        int[][] output=transpose(input);
    }
}
