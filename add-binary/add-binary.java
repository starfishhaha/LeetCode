import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
            
        BigInteger b1,b2;
        b1 = new BigInteger(a,2);
        b2 = new BigInteger(b,2);
        b1 = b1.add(b2);
        //System.out.println(c1);
       
        return b1.toString(2);
    }
}