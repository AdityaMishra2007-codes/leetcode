class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a =new int[2];
     
        int f=binary(nums,target,true);
        int l=binary(nums,target,false);
      
        a[0]=f;
        a[1]=l;

        return a;
        
    }
    public int binary(int[] nums,int target,boolean first){
           int high=nums.length-1;
        int low=0;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
                ans=mid;
            
            if(first){
                high=mid-1;
            }else{
                low=mid+1;
            }
            }
            
            else if(target<nums[mid]){
                high=mid-1;

            }
            else if(target>nums[mid]){
                low=mid+1;
            }
        }
        return ans;
    }
}