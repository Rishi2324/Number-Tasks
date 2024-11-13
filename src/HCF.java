public class HCF {
    public static void main(String[] args) {
        int num = 24,num1 = 36,num2 = 48;
        int a = 0;
        for (int i=1 ; i<=num && i<=num1 && i<=num2;i++){
            if (num%i == 0 && num1%i == 0 && num2%i == 0){
                a = i;
            }}
        System.out.println(a);
    }
}
