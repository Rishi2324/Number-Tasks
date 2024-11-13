public class AmstrongNumber {
    public static void main(String[] args) {
        int ac = 152;
      int rs =  ams(ac);
        if (ac == rs){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
    static int ams(int num){
        int c = 0;
        while (num!=0){
            int a = num%10;
            int b = a*a*a;
            c = b+c;
            num /= 10;
        }
        return c;
    }
}
