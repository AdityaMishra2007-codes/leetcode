class Solution {
    public int removeDuplicates(int[] nums) {
       int[] exp=new int[nums.length];
       int j=0;
       int k=0;
       for(int i=0;i<nums.length;i++){
        if(i==0){
            exp[j]=nums[i];
            
            k++;
        }
        else if(exp[j]<nums[i]){
            exp[++j]=nums[i];
            
            k++;
        }
    
       }
       
       for( int i=0;i<exp.length;i++){
        nums[i]=exp[i];
       }
       return k;
    }
}