class Solution {
    public String trimTrailingVowels(String s) {
        if(s==null ||s.isEmpty()){
            return s;
        }

        int i=s.length()-1;

        while(i>=0 && isVowel(s.charAt(i))){
            i--;
        }
        return s.substring(0,i+1);
    }
    private static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}