class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length+nums2.length];
        int a=0;
        int j=0;
        int i=0;
        int w=0;
        float median=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                result[a]=nums1[i];
                i++;
                a++;
            }
            else{
                result[a]=nums2[j];
                j++;
                a++;
            }
        }
            while(i<nums1.length){
                result[a++]=nums1[i++];
            }
            while(j<nums2.length){
                result[a++]=nums2[j++];
            }
            int n=result.length;
            if(n==0){
                median=0;}

            if(n%2!=0){
                median=(float)result[n/2];
            }
            else{
                w=result[n/2];
                median=(float)(w+result[(n/2)-1])/2;
                
            }
            return median;
            }
    }
    
