public class StrongNumber {
    public static void main(String[] args) {
        int num = 145,b=1,c=0;int res = num;
      while (num!=0){
            int a = num%10;
            for (int i=1;i<=a;i++){
               b = b*i;
            }
            c+=b;
            b=1;
            num/=10;
     }
      if (res == c){
          System.out.println("Strong number");
      }else System.out.println("not");

    }
}
