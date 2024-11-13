public class SumOfDigitUntilSingleDigit {
    public static void main(String[] args) {
        int num = 123456789;
        int s =0;
        int b = 0;
        int d = 0;
        while (num!=0){
            int sum = num%10;
            s= s+sum;
            num /= 10;
        }
        while (s!=0){
            int a = s%10;
            b= b+a;
            s /= 10;
        }
        while (b!=0){
            int c = b%10;
            d= d+c;
            b /= 10;
        }
        System.out.println(d);
    }
}
