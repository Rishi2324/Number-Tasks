public class NumberOfCharInString {
    public static void main(String[] args) {
       NumberOfCharInString ob = new NumberOfCharInString();
        System.out.println(ob.count("hello hello",'o'));
    }
    public int count(String str, char ch) {
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                a++;
            }
        }
        return a;
    }
    }

