public class Reverse_a_string {
    public static void main(String[] args) {
        reverse("Hello");
    }
    static void reverse(String str){
        String a = new String();
        for (int i = str.length()-1; i>=0; i--){
            char ch =str.charAt(i);
            a += ch;
        }
        System.out.println(a);
    }
}
