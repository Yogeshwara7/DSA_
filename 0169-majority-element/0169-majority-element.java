class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int res=0;
        int rep = 0;
        for(int n:nums){
            hash.put(n,1+hash.getOrDefault(n,0));
            if(hash.get(n)>rep){
                res=n;
                rep=hash.get(n);
            }
        }
        return res;
    }
}