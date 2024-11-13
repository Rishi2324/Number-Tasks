public class  Trainling0inFactorial{
    public static void main(String[] args) {
        int num = 10,sum = 1;
        for (int i=1;i<=num;i++){
            sum=sum*i;
        }
        System.out.println(sum);
        int b =0;
        while (sum!=0){
            int a = sum%10;
            if(a == 0){
                b++;
            }
            sum/=10;
        }
        System.out.println(b);
    }
}