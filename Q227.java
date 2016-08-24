import java.util.InputMismatchException;

/**
 * Created by Ge on 2016/6/28.
 * 227. Basic Calculator II
 */
public class Q227 {
    public int calculate(String s) {
        if(s.length() == 0 || s == null){
            return 0;
        }

        int flag = 0; //if there is an operator;
        String[]change = new String[s.length()];
        int len = 0;
        String str = "";

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ') {
               continue;
            } else {
                switch (s.charAt(i)){
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                        flag = 1;
                        change[len] = str;
                        len++;
                        change[len] = s.substring(i, i + 1);
                        str = "";
                        len++;
                        break;
                    default:
                        str = str + s.charAt(i);
                }
            }
        }
        change[len] = str;
        len++;
        if(flag == 0){
            return Integer.parseInt(change[0]);
        }

        int result;
        String[] use = new String[len];
        int count = 0;
        for (int i = 0; i < len; i++){
            use[count] = change[i];
            switch (change[i]){
                case "*":
                    result = Integer.parseInt(use[count - 1]) * Integer.parseInt(change[i + 1]);
                    use[--count] = Integer.toString(result);
                    i++;
                    break;
                case "/":
                    result = Integer.parseInt(use[count - 1]) / Integer.parseInt(change[i + 1]);
                    use[--count] = Integer.toString(result);
                    i++;
                    break;
            }
            count++;
        }

        result = Integer.parseInt(use[0]);
        for(int i = 1; i < count; i = i + 2){
            switch (use[i]){
                case "+":
                    result = result + Integer.parseInt(use[i + 1]);
                    break;
                case "-":
                    result = result - Integer.parseInt(use[i + 1]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Q227 que = new Q227();
        System.out.println(que.calculate("   2*3+4+5"));
    }
}
