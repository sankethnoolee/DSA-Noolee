package lc;

public class LeetCode125 {
    public static void main(String[] args) {
        LeetCode125 lc = new LeetCode125();
        lc.isPalindrome("A man, a plan, a canal: Panama");
    }
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i = 0;
        int l = s.length()-1;
        while(l>i){
            if(s.charAt(i)!=s.charAt(l)){
                return false;
            }
            l--;
            i++;
        }
        return true;
    }
}
