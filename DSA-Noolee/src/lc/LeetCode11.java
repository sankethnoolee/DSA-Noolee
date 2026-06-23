package lc;

public class LeetCode11 {
    //leetCode static to speed up jvm
    //It tries to warm up the JVM so JIT compilation happens before the measured run.
    static {
        for (int i = 0; i < 500; i++) {
            maxArea(new int[]{0, 0});
        }
    }

    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int left = 0;
        int right = 0;
        int res = 0;
        while(l<r){
            left = height[l];
            right = height[r];

            res = Math.max(res, Math.min(left, right) * (r - l));

            if (left < right) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}
