public class Palindrome {
    public static void main(String[] args) {
        int ac = 1234;
       int res = palin(ac);
        if (ac == res){
            System.out.println("Palindrome");
        }else {
            System.out.println("not");
        }

    }
    static int palin(int num){
        int sum = 0;
        while (num!=0){
            int a = num%10;
            sum = (sum*10)+a;
            num /= 10;
        }
       return sum;
    }
}
