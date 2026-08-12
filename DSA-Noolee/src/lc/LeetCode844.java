package lc;

public class LeetCode844 {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        if(!(s.charAt(0)=='#')){
            sb1.append(s.charAt(0));
        }
        for(int i = 1; i<s.length();i++){
            if(s.charAt(i)!='#'){
                sb1.append(s.charAt(i));
            }else{
                if(sb1.length()!=0){
                    sb1.deleteCharAt(sb1.length() - 1);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if(!(t.charAt(0)=='#')){
            sb2.append(t.charAt(0));
        }
        for(int i = 1; i<t.length();i++){
            if(t.charAt(i)!='#'){
                sb2.append(t.charAt(i));
            }else{
                if(sb2.length()!=0){
                    sb2.deleteCharAt(sb2.length() - 1);
                }
            }
        }
        return sb1.compareTo(sb2) == 0;
    }
}
