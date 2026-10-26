class Solution {
    public int reverse(int x) {
        int[] queue=new int[1000];
        int rear=-1;
        int front=0;
        long result=0;
        int count=0;
        if(x<0){
            x=Math.abs(x);
            while(x>0){
                queue[++rear]=x%10;
                x=x/10;
                count++;
            }
            while(front<=rear){
                result=result+(long)queue[front]*(long)Math.pow(10,count-1);
                count--;
                front++;
            }
            result=result*-1;
        }
            else{
                 while(x>0){
                queue[++rear]=x%10;
                x=x/10;
                count++;
            }
            while(front<=rear){
                result=result+(long)queue[front]*(long)Math.pow(10,count-1);
                count--;
                front++;
                
                }
            }
                if(result>=(long)(Math.pow(2,31)-1)||result<=(long)(Math.pow(-2,31))){
                    return 0;
                }

            else{
            return (int)result;
            }


        }
    }
