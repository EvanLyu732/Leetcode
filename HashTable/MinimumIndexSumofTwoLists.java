class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap();
        
        // use an stack to store the minindex string.
        Stack<String> stack = new Stack();
        
        int idx = Integer.MAX_VALUE;
        
        for(int i=0; i<list1.length; i++){
              map.put(list1[i],i);
        }
        
         for(int i=0; i<list2.length; i++){
             if(map.containsKey(list2[i])){
                 if(map.get(list2[i])+i<idx){
                     idx = map.get(list2[i])+i;
                     stack.clear();
                     stack.push(list2[i]);
                 }else if(map.get(list2[i])+i==idx){
                     stack.push(list2[i]);
                 }
             }
         }
        
         String[] res= new String[stack.size()];
         for(int i=0; i<res.length; i++){
             res[i] = stack.pop();
         }
         return res;
    }
}
