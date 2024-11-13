public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int num = 56,num1 = 98;
        int a = 0;
        for (int i=1 ; i<=num && i<=num1;i++){
            if (num%i == 0 && num1%i == 0){
                a = i;
            }}
        System.out.println(a);
        }
    }

