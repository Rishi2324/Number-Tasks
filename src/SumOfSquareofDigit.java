public class SumOfSquareofDigit {
    public static void main(String[] args) {
        int num = 123;
        int s = 0;
      while (num!=0){
           int sum = num%10;
            sum = sum*sum;
            s  = s+sum;
            num /=10;
       }
        System.out.println(s);
    }
}
