import java.util.Arrays;


public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end){
        String[] words = new String[end - start];
        for(int i = 0; i < words.length; i++){
            if((i + start) % 3 == 0 && (i + start) % 5 == 0){
                words[i] = "FizzBuzz";
                continue;
            }
            if((i + start) % 3 == 0 && !((i + start) % 5 == 0)){
                words[i] = "Fizz";
                continue;
            }
            if(!((i + start) % 3 == 0) && (i + start) % 5 == 0){
                words[i] = "Buzz";
            }
            else{
                words[i] = String.valueOf(i + start);
            }
        }
        return words;
    }
    public static void main(String[] args) {
        String[] arr = fizzBuzz(1, 6);
        System.out.print(Arrays.toString(arr));
    }

}
