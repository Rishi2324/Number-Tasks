public class SumOfPrimeNumberinRange {
    public static void main(String[] args) {
        int num = 10,num1 = 20;
    int a = 0;
        for (int i = num; i <= num1 ; i++) {
            boolean sum =true;
            for (int j = 2; j < num; j++) {
                if (i%j == 0) {
                    sum = false;
                   break;
                }
            }if (sum){
                a+=i;
            }
        }
        System.out.println(a);
    }
    }

