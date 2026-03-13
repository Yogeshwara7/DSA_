class Solution {
    public int maximumStrongPairXor(int[] a) {
        int max=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int x=a[i];
                int y=a[j];
                if(Math.abs(x-y)<=Math.min(x,y))
                max=Math.max(max,x^y);
            }
        }
        return max;
    }
}