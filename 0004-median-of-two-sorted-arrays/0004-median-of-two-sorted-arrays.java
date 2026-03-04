class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length ;
        int len2 = nums2.length ;
        int len = len1 + len2;
        int[] arr = new int[len];
        double median;
        int i = 0, j =0 ;
        int k  = 0;

        while(i < len1 && j < len2){
            if(nums1[i] < nums2[j]){
                arr[k++] = nums1[i];
                i++;
            }else{
                arr[k++] = nums2[j];
                j++;
            }
        }

        while(i < len1) arr[k++] = nums1[i++];
        while(j < len2) arr[k++] = nums2[j++];

        if(len % 2 == 0){
            int x = len/2;
             median = (arr[x]+arr[x-1])/2.0;
        }
        else{
            int  x = len/2;
             median = arr[x];
        }

        return median;
        
    }
}