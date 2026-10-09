class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){return false;}
        int i=0,c=0;
        String str=x+"";
        int l=str.length()-1;
        while(i<=l){
            if(str.charAt(i)==str.charAt(l)){
                c=1;
            }
            else{
                c=0;
                break;
            }
            i++;
            l--;
            }
            if(c==1){
                return true;

            }
            else return false;

        }


        }
        
    
