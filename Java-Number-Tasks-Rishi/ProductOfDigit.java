public class ProductOfDigit {
    public static void main(String[] args) {
        int num = 234;
        int s = 1;
        while (num!=0){
          int sum = num%10;
           s *=sum;
           num /= 10;

        }
        System.out.println(s);
    }
}
