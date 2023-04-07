public class Kata {
    public static int[] rowWeights (final int[] weights){
      int size = weights.length;
      int team1 = 0;
      int team2 = 0;
      
      for(int i = 0; i < size; i++){
        if(i % 2 == 0){
          team1 += weights[i]; 
        }
        if(i % 2 != 0){
          team2 += weights[i];
        }
      }
      
      return new int[] {team1, team2};
    }
}
