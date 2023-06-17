public class Kata {
    public static String position(char alphabet) {
      if(Character.isLowerCase(alphabet)){
        int position = alphabet - 'a' + 1;
        return "Position of alphabet: " + position;
      }else if(Character.isUpperCase(alphabet)){
        int position = alphabet - 'A' + 1;
        return "Position of alphabet: " + position;
      }
      return "";
    }
}