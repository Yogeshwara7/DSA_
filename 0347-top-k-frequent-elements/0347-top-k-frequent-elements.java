class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> ha= new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int num:nums){
            ha.put(num,ha.getOrDefault(num,0)+1);
        }
        List<Integer>[] bucket=new ArrayList[nums.length+1];

        for(int key:ha.keySet()){
            int h=ha.get(key);
            if(bucket[h]==null){
                bucket[h]=new ArrayList<>();
            }
            bucket[h].add(key);
        }
        
        int[] numm=new int[k];
        int index=0;
        for(int i=bucket.length-1;i>=0&&index<k;i--){
            if(bucket[i]!=null){
                for(int num:bucket[i]){
                    numm[index++]=num;
                    if(index==k)
                        break;
                }
            }
        }
        return numm;
    }
}
