class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int repeat=-1,miss=-1;
        Map<Integer,Integer> ha=new HashMap<>();

        for(int[] row:grid){
            for(int num:row){
                ha.put(num,ha.getOrDefault(num,0)+1);
            }  
        }

        for(int i=1;i<=n*n;i++){
            if(!ha.containsKey(i)){
                miss=i;
            }
            else if(ha.get(i)==2){
                repeat=i;
            }
        }

        return new int []{repeat,miss};
        

        
    }
}