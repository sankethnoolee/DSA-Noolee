package lc;

public class LeetCode8 {
    public static void main(String[] args) {
        LeetCode8 lc = new LeetCode8();
        lc.myAtoi("-91283472332");
    }
    public int myAtoi(String s) {
        boolean neg = false;
        s = s.trim();
        if(s.isBlank() || s.isEmpty())return 0;
        if(s.charAt(0)=='-'){
            neg = true;
            s = s.substring(1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }else{
                break;
            }
        }
        if(neg){
            sb.insert(0,'-');
        }
        if(sb.length()>11 && !neg){
            return Integer.MAX_VALUE;
        }

        if(sb.length()>10 && neg){
            return Integer.MIN_VALUE;
            //sb.delete(10,sb.length());
        }
        return (sb.toString().equals("")|| sb.toString().equals("-"))?0:Integer.parseInt(sb.toString());
    }
}
