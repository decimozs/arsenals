public class CodeWars {
	public static String fireFight(String s){
    String replace = "";
    
    for(int i = 0; i < s.length(); i++){
        replace = s.replace("Fire", "~~");
    }
    return replace;
  }

  
