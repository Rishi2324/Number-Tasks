public class Reverse_a_number {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        while (num!=0){
            int a= num%10;
            sum = (sum*10)+a;
            num = num/10;
        }
        System.out.println(sum);
    }
}
