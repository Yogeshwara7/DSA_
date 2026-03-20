class Solution {
    private void back(int[] candidates,int target,int i,List<List<Integer>> l,List<Integer> temp){
        if(target==0){
            l.add(new ArrayList<>(temp));
            return;
        }

        if(target<0){
            return;
        }


        for(int j=i;j<candidates.length;j++){
            temp.add(candidates[j]);
            back(candidates,target-candidates[j],j,l,temp);
            temp.remove(temp.size()-1);

        }
    }    



    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> temp =new ArrayList<>();
        back(candidates,target,0,l,temp);
        return l;
    }
}