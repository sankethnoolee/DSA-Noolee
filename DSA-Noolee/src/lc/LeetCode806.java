package lc;

public class LeetCode806 {
    public static void main(String[] args) {
        LeetCode806 lc = new LeetCode806();
        lc.numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},"bbbcccdddaaa");
    }
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 0;
        int pix = 100;
        for(char c : s.toCharArray()){
            if(pix<widths[c-'a']){
                lines++;
                pix = 100;
            }
            pix -=widths[c-'a'];

        }
        if(pix!=100){
            lines++;
        }
        return new int[]{lines,100-pix};
    }
}
