public class oddEvenSumPosition {
    public static void main(String[] args) {
        int num = 13245;
        for(int i=1;i<=num;i++){
            int a = num%10;
            if (a%2 == 0){
                System.out.println("even");
            }
        }
    }
}
