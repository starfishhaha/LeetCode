class Solution {
    public boolean isValid(String s) {
        Stack stack1 = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('|| s.charAt(i) =='['|| s.charAt(i) =='{')
                stack1.push(s.charAt(i));
            else{
                if(!stack1.isEmpty()){
                    if(stack1.peek().equals( '(') && s.charAt(i)==')')
                         stack1.pop();
                    else if(stack1.peek().equals( '[' )&& s.charAt(i)==']')
                         stack1.pop();
                    else if(stack1.peek().equals('{' )&& s.charAt(i)=='}')
                         stack1.pop();
                    else 
                        return false;
                }
                else return false;
            }
        }
        if(stack1.empty())
            return true;
        return false;
    }
}
