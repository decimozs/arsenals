public class TotalPoints {
    public static int points(String[] games) {
      int results = 0;
      
      for(String matchResult : games){
        String[] scores = matchResult.split(":");
        int x = Integer.parseInt(scores[0]);
        int y = Integer.parseInt(scores[1]);
        
        if(x > y){
          results += 3;
        }else if(x == y){
          results += 1;
        }else{
          results += 0;
        }
      }
      
      return results;
    }
}