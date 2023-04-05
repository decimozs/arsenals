public class Kata {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int size = arrayOfSheeps.length;
        int sheep = 0;
    
        for(int i = 0; i < size; i++){
          if(arrayOfSheeps[i] != null && arrayOfSheeps[i] != false){
            sheep++;
          }
        }
    
        System.out.println(sheep);
        return sheep;
      }
}
