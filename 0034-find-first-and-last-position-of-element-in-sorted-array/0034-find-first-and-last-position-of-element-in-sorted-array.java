class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstsearch(nums, target);
        int last = lastsearch(nums , target);
        return new int[]{first, last};
    }

    int firstsearch(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(target==nums[mid]){
                ans = mid;
                high = mid-1;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    int lastsearch(int[] nums , int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(target==nums[mid]){
                ans=mid;
                low=mid+1;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}