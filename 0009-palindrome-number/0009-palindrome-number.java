class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int res=0;

        if(x<0 ||x%10==0 && x!=0 ){
            return false;

        }
        while(x>res){
        int y= x%10;
        res = res*10+y;
        x=x/10;
        }
        return x==res ||x==res/10;
    }
}