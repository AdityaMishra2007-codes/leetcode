class Solution {
    public double myPow(double x, int n){
        long q=n;
        double result=1;
        double cp=x;
        double w=0;
        if(q<0){
            x=1/x;
            q=-q;
        }
    
            while(q>0){
                if(q%2==1){
                result=result*cp;
                }
                cp=cp*cp;
                q=q/2;

            }
            if(n<0){
                w=1/result;

            }
            else{w=result;}
            return w;
        }

       
    }
