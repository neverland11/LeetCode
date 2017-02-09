import java.util.HashMap;

/**
 * Created by Ge on 2016/11/7.
 * 242. Valid Anagram
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * anagram: 同字母
 */
public class Q242 {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> counts = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char temp  = s.charAt(i);
            if(counts.containsKey(temp)){
                counts.put(temp, counts.get(temp) + 1);
            } else {
                counts.put(temp, 1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            char temp = t.charAt(i);
            if(counts.containsKey(temp) == false){ //if there is some char don't appear both of them
                return false;
            } else {
                counts.put(temp, counts.get(temp) - 1);
                if(counts.get(temp) == 0){
                    counts.remove(temp);
                }
            }
        }

        if(counts.isEmpty()){
            return true;
        } else {
            return false;
        }


    }
}
