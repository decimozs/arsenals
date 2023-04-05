import java.util.*;

class kata {
  public static boolean check(Object[] a, Object x) {
    for (Object i : a) {
      if(i == x){
        return true;
      }
    }

    return false;
  }
  public static void main(String[] args){
    kata.check(new Object[] {66, 101}, 66);
    kata.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45);
    kata.check(new Object[] {'t', 'e', 's', 't'}, 'e');
    kata.check(new Object[] {"what", "a", "great", "kata"}, "kat");
  }
}