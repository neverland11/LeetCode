/**
 * Created by Ge on 2016/11/29.
 * 5. Longest Palindromic Substring
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 */
public class Q5 {
    public String longestPalindrome(String s) {
        if(s.length() <= 1){
            return s;
        }

        int maxlength = 0; //max length of substring
        String res = "";
        String temp = res;

        for(int i = 0; i < 2*s.length() - 1; i++){
            //center
            int left = i/2;
            int right = i/2;
            if(i % 2 == 1){
                //in the mid of two number, move right
                right++;
            }


            while(left >=0 && right < s.length() && (s.charAt(left) == s.charAt(right))){
                left--;
                right++;
            }

            temp = s.substring(left + 1, right);

            if(maxlength < temp.length()){
                res = temp;
                maxlength = temp.length();
            }
        }
        return res;
    }
}
