public class OddOrEven {
    public static void main(String[] args) {
        int num = 12354;
        int even =0;
        int odd = 0;
        while (num!=0){
            int a = num%10;
            if (a%2 == 0){
                even+=a;
            } else {
                odd+=a;
            }
            num/=10;
        }
        System.out.println("Sum of even number is : "+even);
        System.out.println("Sum of odd number is : "+odd);

    }
}
