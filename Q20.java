/**
 * Created by Ge on 2016/11/07.
 * 20. Valid Parentheses
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 */

public class Q20 {
    public boolean isValid(String s) {
        char[]front = new char[s.length()];
        int length = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{'){
                front[length] = s.charAt(i);
                length++;
            } else {
                if(length == 0){
                    return false;
                } else {
                    if(s.charAt(i) == ')' && front[length - 1] == '('){
                        length--;
                    } else if(s.charAt(i) == ']' && front[length - 1] == '[') {
                        length--;
                    } else if(s.charAt(i) == '}' && front[length - 1] == '{') {
                            length--;
                    } else {
                        return false;
                    }
                }
            }
        }

        if(length == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Q20 que = new Q20();
        que.isValid("()");
    }
}