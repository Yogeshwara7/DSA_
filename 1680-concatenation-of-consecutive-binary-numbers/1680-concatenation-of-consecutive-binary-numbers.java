class Solution {
    public int concatenatedBinary(int n) {
        final int MOD=1_000_000_007;
       int bits=0;
       long result=0;
        for(int i=1;i<=n;i++) {
        if((i&(i-1))==0){
            bits++;
        }
       result =((result<<bits)|i)%MOD;
        }
        return (int)result;
    }
}