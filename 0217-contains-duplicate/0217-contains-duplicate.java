class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> map= new HashMap<>(); 
        int c=0;
        for(int i=0;i<=nums.length-1;i++){
            
            if(map.containsKey(nums[i])){
                c=0;
                break;
                
            }
            else{
                map.put(nums[i],i);
                c=1;
                

            }

            
        }
        
    
   if (c==1){
            return false;
        }
        else return true;
}
}