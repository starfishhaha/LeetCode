import java.util.*;
class Solution {
public int lengthOfLongestSubstring(String s) {
    int i = 0, j = 0, max = 0;
    Set<Character> set = new HashSet<>();
    
    while (j < s.length()) {
        if (!set.contains(s.charAt(j))) {
            set.add(s.charAt(j++));
            max = Math.max(max, set.size());
        } else {
            set.remove(s.charAt(i++));
        }
    }
    
  return max;
}
}
// import java.util.*;
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         if(s == null) return 0;
//         if(s.length() == 1) return 1; 
//         int result = 0;
//         Set<Character> hs = new HashSet<Character>();
//         for(int i=-1; i< s.length(); i++){
//             for(int j=i+1; j<s.length(); j++){
//                 if(hs.contains(s.charAt(j))){
//                     result = (result>hs.size())? result : hs.size();
//                     break;
//                 }
//                 else{
//                     hs.add(s.charAt(j));
//                 }
//             }
//             result = (result>hs.size())? result : hs.size();
//             hs.clear();
//         }
//          return result;
//     }
   
// }

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         if(s.equals("")) return 0;
//         int max = 0;
//         for(int i=0; i < s.length();i++){
//             int length = 1;
//             for(int j=i+1; j<s.length(); j++){
//                 if((i+length)<s.length() && (!s.substring(i,i+length).contains(s.charAt(j)+"")) ){
//                     length++;
//                     max = max > length ? max : length;
//                     System.out.println(" "+max + " ");
                    
//                 }
//                 else{
//                     break;
//                 }
                
//             }
//             //System.out.println(" ------- ");
            
            
//         }
//         return max == 0? 1 : max ;
//     }
// }