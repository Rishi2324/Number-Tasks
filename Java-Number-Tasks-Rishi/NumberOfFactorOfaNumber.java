public class NumberOfFactorOfaNumber {
    public static void main(String[] args) {
        int num = 36,a=0;
        for (int i=1;i<=num;i++){
            if (num%i == 0){
                a++;
            }
        }
        System.out.println(a);
    }
}
