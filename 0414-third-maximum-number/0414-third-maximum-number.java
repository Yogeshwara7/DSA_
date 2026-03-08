class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int f=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    f=1;
                    break;
                }
            }
            if(f==0){
                arr.add(nums[i]);
            }
        }
        for(int i=0;i<arr.size()-1;i++){
            for(int j=1;j<arr.size()-i;j++){
                if(arr.get(j)<arr.get(j-1)){
                    int temp=arr.get(j-1);
                    arr.set(j-1, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        if(arr.size()<=2){
            return arr.get(arr.size()-1);
        }
        else{
            return arr.get(arr.size()-3);
        }
    }
}