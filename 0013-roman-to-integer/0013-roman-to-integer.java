class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
         map.put('I',1);
         map.put('V',5);
         map.put('X',10);
         map.put('L',50);
         map.put('C',100);
         map.put('D',500);
         map.put('M',1000);
         int w=s.length();
         int result=0;
         int i=0,j=1;
         int value=0,value2=0;
         while(i<w ){
            value2=0;
         
            char a=s.charAt(i);
            if(j<w){
            char a1=s.charAt(j);
            value2=map.getOrDefault(a1,0);
            }
             value = map.getOrDefault(a,0);
             
            if(value<value2){
                result=result+(value2-value);
                i+=2;
                j=i+1;
            }
            else{
                result=result+value;
                i++;
                j=i+1;
            }
         }
         return result;

         }
        
    }
