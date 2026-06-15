package lc;

public class LeetCode476 {
    public int findComplement(int num) {

        String binaryStr = Integer.toBinaryString(num);
        return Integer.parseInt(getOnesComplement(binaryStr), 2);
    }


    public static String getOnesComplement(String binary) {
        StringBuilder sb = new StringBuilder();
        for (char bit : binary.toCharArray()) {
            if (bit == '0') {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return sb.toString();
    }

}
