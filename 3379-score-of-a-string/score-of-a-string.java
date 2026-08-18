class Solution {
    public int scoreOfString(String s) {
       int score=0;
       char t=s.charAt(0);
       int x=(int)t;
       for(int i=1;i<s.length();i++){
            char c=s.charAt(i);
            int y=(int)c;
            score+=Math.abs(x-y);
            x=y;
       }
       return score;
    }
}