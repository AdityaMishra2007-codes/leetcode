class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character , Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int a=0;
        int temp=0;
        for(i=0;i<=s.length()-1;i++){
            map.clear();
            map.put(s.charAt(i),i);
            temp++;
            for(j=i+1;j<=s.length()-1;j++){
                if(map.containsKey(s.charAt(j))){
                    break;
                }
                    else{
                        map.put(s.charAt(j),j);
                        temp++;
                    }
                
            }
            if(a<temp){
                a=temp;
                temp=0;
            }
            temp=0;

        
        }
        return a;

        
    }
}