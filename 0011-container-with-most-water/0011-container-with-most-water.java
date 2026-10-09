class Solution {
    public int maxArea(int[] height) {
       int i=0,j=height.length-1,a=0,l=0,b=0,a1=0;
       
        while(i<j && i<height.length){
            l=Math.min(height[i],height[j]);
            b=j-i;
            a=l*b;
            a1=Math.max(a1,a);
            if(height[i]<height[j]){
                i++;

            }
            else j--;
            }
        
        return a1;
    }

}