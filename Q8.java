/**
 * Created by Ge on 2016/11/7.
 * 8. String to Integer (atoi)
 * Implement atoi to convert a string to an integer.
 */
public class Q8 {
    public int myAtoi(String str) {
        if(str.length() == 0) {
            return 0;
        }
        str = str.trim(); //delete the space
        long res = 0;
        int sign = 1;
        int index = 0;
        if(str.charAt(0) == '-'){
            sign = -1;
            index++;
        } else if(str.charAt(0) == '+'){
            sign = 1;
            index++;
        }

        for(int i = index; i < str.length(); i++){
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                break; //end
            } else {
                res = res * 10 + str.charAt(i) - '0';
                if(res * sign > Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                } else if(res * sign < Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
            }
        }
        return (int)res * sign;
    }
}
