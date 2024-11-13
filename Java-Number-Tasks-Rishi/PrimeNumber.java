public class PrimeNumber {
    public static void main(String[] args) {
        int num = 15;
        boolean sum =true;
        for (int i=2; i<num; i++){
            if (num%i == 0){
              sum = false;
              break;
            }
        }if (sum){
            System.out.println("Prime");
        }else
        System.out.println("not");
    }
}
