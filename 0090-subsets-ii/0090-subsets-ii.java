class Solution {

    private List<List<Integer>> subsets;
    private int[] numbers;

    private void backtrack(int index,List<Integer> currentSubset){
                                              
        subsets.add(new ArrayList<>(currentSubset));
      
        for (int i=index;i<numbers.length;++i){
           
            if (i!=index &&numbers[i]==numbers[i-1]){
                continue; 
            }
            currentSubset.add(numbers[i]);
            backtrack(i+1,currentSubset);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        subsets =new ArrayList<>();
        Arrays.sort(nums);
        this.numbers =nums;
        backtrack(0,new ArrayList<>()); 
        return subsets;
    }
}