public class Kata {
    public static boolean check(Object[] a, Object x) {
        for (Object i : a) {
          if(i == x){
          return true;
          }
      }
  
      return false;
    }
}