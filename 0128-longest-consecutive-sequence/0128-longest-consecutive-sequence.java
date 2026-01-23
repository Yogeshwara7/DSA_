class Solution {
    public int longestConsecutive(int[] nums) {
        List<Integer> ha = new ArrayList<>();
        int count=1;
        int longest=1;
        for(int num:nums){
            ha.add(num);
        }

        if(ha.size()==0){
            return 0;
        }
        Collections.sort(ha);

        for(int i=1;i<ha.size();i++){
            if(ha.get(i).equals(ha.get(i-1))){
                continue;
            }
            if(ha.get(i)==ha.get(i-1)+1){
                count++;
            }
            else{
                count=1;
            }
        longest = Math.max(longest, count);

        }
        return longest;
    }
}
