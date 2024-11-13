public class FibonacciSeries {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1 ,temp = 0;
        int user = 7;
        for (int i=0;i<=user;i++){
            temp = num1;
            num1 = num2;
            num2 = temp + num1;
        }
        System.out.println(temp);
    }
}
