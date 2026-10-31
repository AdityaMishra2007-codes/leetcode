class Solution {
    public List<String> letterCombinations(String digits) {
          List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

            HashMap<Character,String>map1=new HashMap<>();
             map1.put('2',"abc");
              map1.put('3',"def");
               map1.put('4',"ghi");
                map1.put('5',"jkl");
                 map1.put('6',"mno");
                  map1.put('7',"pqrs");
                   map1.put('8',"tuv");
                    map1.put('9',"wxyz");

                    int len=digits.length();
                    String s1=map1.get(digits.charAt(0));
                    String s2 = (len > 1) ? map1.get(digits.charAt(1)) : "";
                    String s3 = (len > 2) ? map1.get(digits.charAt(2)) : "";
                    String s4 = (len > 3) ? map1.get(digits.charAt(3)) : "";
                    if(len==1){
                        for(char c1:s1.toCharArray()){
                            result.add(""+c1);
                        }
                    }
                    else if(len==2){
                         for(char c1:s1.toCharArray()){
                               for(char c2:s2.toCharArray()){
                                result.add(""+c1+c2);
                               }
                         }
                        
                    }
                    else if(len==3){
                         for(char c1:s1.toCharArray()){
                               for(char c2:s2.toCharArray()){
                                    for(char c3:s3.toCharArray()){
                                        result.add(""+c1+c2+c3);
                                    }
                               }
                         }
                    }
                      else if(len==4){
                         for(char c1:s1.toCharArray()){
                               for(char c2:s2.toCharArray()){
                                    for(char c3:s3.toCharArray()){
                                        for(char c4:s4.toCharArray()){
                                        result.add(""+c1+c2+c3+c4);
                                        }
                                    }
                               }
                         }
                    }
                    return result;

    }
}
