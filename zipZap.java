
public class zipZap {
    public static String zipZap(String str) {
        String result = "";
        if(str.length() < 3){
          return str;
        }
        for(int i = 0; i < str.length() - 2; i++){
          String sub = str.substring(i, i + 3);
          if(str.substring(i, i + 1).equals("z") && str.substring(i + 2, i + 3).equals("p")){
            result += str.substring(i, i + 1) + str.substring(i + 2, i + 3);
            i += 2;
            continue;
          }
          result += str.substring(i, i + 1);
        }
        if(!(str.substring(str.length() - 3, str.length() - 2).equals("z") && 
        str.substring(str.length() - 1).equals("p"))){
          result += str.substring(str.length() - 2);
        }
        return result;
      }

    
    public static void main(String[] args){
        String result = zipZap("zzzopzop");
        System.out.print(result);
    }
    
}
