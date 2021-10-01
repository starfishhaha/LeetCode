import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<digits.length;i++){
            sb.append(digits[i]);
        }
        
        BigInteger num = new BigInteger(sb.toString());
        String a = "1";
        BigInteger num2 = new BigInteger(a);
        
        num = num.add(num2);
        
        int len = String.valueOf(num).length();
        
        int result[] = new int [len];
        String word = String.valueOf(num);
        //System.out.println(num);
        /*
        for(int i=len-1;i>-1;i--){
            result[i] =(int) num%10;
            //System.out.println(result[i]);
            num = num/10;
        }*/
        for(int i=0;i<len;i++){
            result[i] = Character.getNumericValue(word.charAt(i));
        }
        
        return result;
                                         
    }
}