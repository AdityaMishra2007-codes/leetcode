class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set1=new HashSet<>();
        for(int c:nums){
            set1.add(c);
        }
        int biggest=0;
        for(int num:set1){
            if(set1.contains(num-1)){
                continue;
                
            }
            else {
                int streak=1;
                int j=1;
                while(set1.contains(num+j)){
                    streak+=1;
                    j++;
                }
            
            
            biggest=Math.max(streak,biggest);
        }
        }
        return biggest;

    }
}