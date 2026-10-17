class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n=nums1.length;
        int m=nums2.length;


        int i=0;
        int j=0;
        int k=0;
        int [] merged =new int[n+m];

        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                merged[k]=nums1[i];
                i++;
                k++;

            }else{
                merged[k]=nums2[j];
                j++;
                k++;

            }

        }
        while(i<n){
            merged[k]=nums1[i];
                i++;
                k++;

        }
        while(j<m){
            merged[k]=nums2[j];
                j++;
                k++;
        }

        // double median=0;
        int q=merged.length;

        if(q%2==1){
            return merged[q/2];
        }else{

             
             int mid1=merged[q/2-1];
             int  mid2=merged[q/2];
            return (mid1+mid2)/2.0;
        }
    }
}
