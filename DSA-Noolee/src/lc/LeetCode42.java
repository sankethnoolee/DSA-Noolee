package lc;

public class LeetCode42 {
    public int trap(int[] height) {
        int leftMax=0,rightMax = 0,l=0,r = height.length-1, res = 0;
        while(l<r){
            if(height[l]<height[r]){
                if(height[l]>=leftMax){
                    leftMax = height[l];
                }else{
                    res = res+leftMax-height[l];
                }
                l++;
            }else{
                if(height[r]>=rightMax){
                    rightMax = height[r];
                }else{
                    res = res+rightMax-height[r];
                }
                r--;
            }
        }
        return res;
    }
}
