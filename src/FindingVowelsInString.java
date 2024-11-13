public class FindingVowelsInString {
    public static void main(String[] args) {
        System.out.println(vowelCount("HellooU"));
    }
    static int vowelCount(String str){
        int count = 0;
        for (int i=0;i<str.length();i++){
            if (str.toLowerCase().charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }

        }

        return count;
    }
}
