class Solution {
    public List<Integer> transformArray(int[] arr) {
        boolean change = true;
        int[] prev=arr.clone();
        
        while(change){
            change =false;
            for(int i=1; i<arr.length-1; i++){
                if(prev[i]<prev[i-1] && prev[i]<prev[i+1]) arr[i]++;
                if(prev[i]>prev[i-1] && prev[i]>prev[i+1]) arr[i]--;
            }
    
            for(int i=0;i<arr.length;i++){
                if(prev[i]!=arr[i]){
                    prev[i]=arr[i];
                    change=true;
                }
            }
        }
        
        List<Integer> out =new ArrayList<Integer>();
        for (int num : prev)
            out.add(num);
        return out;
    }
}
