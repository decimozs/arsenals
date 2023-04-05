public class Kata{
    public static int getAverage(int[] marks){
		int size = marks.length;
    int sum = 0;
    int avg = 0;
    
    for(int i = 0; i < size; i++){
      sum += marks[i];
    }
    
    avg = sum / size;
    
    return avg;
	}
}
