public class getSandwich {
    public static String getSandwich(String str) {
        String result = "";
        int bread1 = 0;
        int bread2 = 0;
        if(str.length() < 10){
          return "";
        }
        for(int j = 0; j < str.length() - 5; j++){
          if(str.substring(j, j + 5).equals("bread")){
            if(j >= str.length()/2){
              return "";
            }
            bread1 = j + 5; //index of bread1 end
            break;
          }
        }
        for(int i = str.length() - 5; i > 0; i--){
          if(str.substring(i, i + 5).equals("bread")){
            if(i <= str.length()/2){
              return "";
            }
            bread2 = i;
            break;
          }
        }
        
        return str.substring(bread1, bread2);
      }

    public static void main(String[] args) {
        String result = getSandwich("breadjambread");
        System.out.print(result);
    }

}
