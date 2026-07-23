package lc;

public class LeetCode541 {
    public static void main(String[] args) {
        LeetCode541 lc = new LeetCode541();
        System.out.printf(lc.reverseStr("abcdefg",2));
    }
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        if(s.length()<k){
            sb.append(s);
            sb.reverse();
            return sb.toString();
        }
        int c = k;
        boolean f = true;
        for(int i = 0; i<s.length();i++){
            temp.append(s.charAt(i));
            if(f){
                c--;
            }else{ c++;}
            if(c==0){
                f=false;
                temp.reverse();
                sb.append(temp);
                temp = new StringBuilder();
            }else if(c==k){f=true;

                sb.append(temp);
                temp = new StringBuilder();
            }
        }
        if(f){
            sb.append(temp.reverse());
        }else{sb.append(temp);}


        return sb.toString();
    }
}
