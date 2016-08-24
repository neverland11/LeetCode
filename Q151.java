/**
 * Created by Ge on 2016/6/27.
 * 151. Reverse Words in a String
 */
public class Q151 {
    public String reverseWords(String s) {
        String res = "";
        String[]temp = s.split(" ");
        if (temp.length == 0){
            return res;
        }
        res = res + temp[temp.length - 1];
        for (int i = temp.length - 2; i >= 0; i--) {
            if (!temp[i].equals("")) {
                if(res.equals("")){
                    res = res + temp[i];
                } else {
                    res = res + " " + temp[i];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Q151 use = new Q151();
        String result = use.reverseWords(" ");
        System.out.println(result);
    }
}
