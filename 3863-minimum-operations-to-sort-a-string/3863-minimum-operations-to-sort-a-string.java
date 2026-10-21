class Solution {
    public int minOperations(String s) {
        int c=0;
        int n=s.length();
        boolean a=true;
        for(int i=0;i<s.length()-1;i++){
            char key=s.charAt(i);
            if(key>s.charAt(i+1)){
                a=false;
                break;
            }

        }
        if(a){return 0;}
        if(s.length()==2){return -1;}
        int minI=0;
        int maxI=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)<s.charAt(minI)){
                minI=i;
            }
            if(s.charAt(i)>=s.charAt(maxI)){
                maxI=i;
            }
             
        }
        
        if(s.charAt(0)==s.charAt(minI)||s.charAt(n-1)==s.charAt(maxI)){return 1;}
        if(minI<n-1 || maxI>0){
            return 2;
        }    
        
            
        

        return 3;
    }
}