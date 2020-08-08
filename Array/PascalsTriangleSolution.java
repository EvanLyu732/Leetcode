class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> gen = new ArrayList<List<Integer>>();
        
        if(numRows==0){
            return gen;
        }
       
        //new array first element always be 1;
        gen.add(new ArrayList<>());
        gen.get(0).add(1);
        
        for(int rowNum=1; rowNum<numRows; rowNum++){
                  List<Integer> row = new ArrayList<>();
                  List<Integer> prevRow = gen.get(rowNum-1);
            
                  row.add(1);
            
                  for (int j = 1; j < rowNum; j++) {
                      row.add(prevRow.get(j-1) + prevRow.get(j));
                  }
                 
                  row.add(1);
                  gen.add(row);
        }
        return gen;
        
    }
}
