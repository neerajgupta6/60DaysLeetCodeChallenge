class Solution {
    public int maxArea(int[] height) {
       int left=0;
       int right=height.length-1; 

       int maxWater=0;

       while (left < right){
        int width=right-left;

        int area=Math.min(height[left],height[right]);
        int h=width*area;

        maxWater=Math.max(maxWater,h);

        if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }

       }
       return maxWater;

    }
}
