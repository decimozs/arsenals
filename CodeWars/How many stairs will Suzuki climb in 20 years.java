public class Kata {
    public static long stairsIn20(int[][] stairs){
        int size = stairs.length;
        long result = 0;
        long sum = 0;
        
        for(int i = 0; i < size; i++){
          for(int j = 0; j < stairs[i].length; j++){
            sum += stairs[i][j];
          }
        }
        
        result = sum * 20;
       
        return result;
      }
}
