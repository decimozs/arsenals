public class Kata{
    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] result = new String[n];
        int size = result.length;
        
        for(int i = 0; i < size; i++){
          result[i] = (i % 2 == 0) ? firstValue : secondValue;
        }
        
        return result;
      }
}