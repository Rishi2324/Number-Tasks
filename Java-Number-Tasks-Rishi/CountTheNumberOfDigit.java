public class CountTheNumberOfDigit {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while (num!=0){
            int a = num%10;
            sum++;
            num/=10;
        }
        System.out.println(sum);
    }
}
