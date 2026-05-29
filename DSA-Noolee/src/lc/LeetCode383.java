package lc;

public class LeetCode383 {

    //BRUTE FORCE
        public boolean canConstruct(String ransomNote, String magazine) {
            //solution
            int[] cnt = new int[26];
            for (int i = 0; i < magazine.length(); ++i) {
                ++cnt[magazine.charAt(i) - 'a'];
            }
            for (int i = 0; i < ransomNote.length(); ++i) {
                if (--cnt[ransomNote.charAt(i) - 'a'] < 0) {
                    return false;
                }
            }
            return true;



           /* int [] rn = hashMyString(ransomNote);
            int [] mn = hashMyString(magazine);
            for(Character c : ransomNote.toCharArray()){
                if(rn[c-'a']!=mn[c-'a']){
                    return false;
                }
            }
            return true;


        }
        private int [] hashMyString(String s) {

            //just auto boxing improved the perf by 25%
            int [] ia = new int[26];
            for(Character c : s.toCharArray()){
                ia[c-'a']++;
            }
            return ia;

        }*/
        }
}
