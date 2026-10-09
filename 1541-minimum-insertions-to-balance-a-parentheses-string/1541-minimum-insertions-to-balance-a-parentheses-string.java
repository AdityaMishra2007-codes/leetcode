class Solution {
    public int minInsertions(String s) {
        int stack=0;
        int i=0;
        int ans=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                stack++;
                i++;
            }
            else{
                if(i+1<s.length() && s.charAt(i+1)==')'){
                    i+=2;
                }
                else{
                    ans++;
                    i++;
                }
                if(stack>0){
                    stack--;
                }
                else{
                    ans++;
                }
            }
        }
        ans+=stack*2;
        return ans;
    }
}