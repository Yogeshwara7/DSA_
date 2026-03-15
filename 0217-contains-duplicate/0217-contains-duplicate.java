import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n= nums.length;
        int i=0;
        int j=i+1;
        Arrays.sort(nums);
        while(i<n && j <n){
            if(nums[i] == nums[j]){
                return true;
            }
            else{
                i++;
                j++;
            }
        }
        return false;
    }
}