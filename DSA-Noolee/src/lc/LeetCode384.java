package lc;

import java.util.Random;

public class LeetCode384 {
    private int[] original;
    private int[] array;
    private Random random;

    public LeetCode384(int[] nums) {
        this.original = nums.clone();
        this.array = nums;
        this.random = new Random();
    }

    public int[] reset() {
        this.array = this.original.clone();
        return this.array;
    }

    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            int randomIndex = i + random.nextInt(array.length - i);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
        return array;
    }
}
