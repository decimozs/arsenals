public class Kata {
    public static String createPhoneNumber(int[] numbers) {
      String phoneNumber = "";
      
      String areaCode = "(" + numbers[0] + numbers[1] + numbers[2] +")" ;
      String firstNs = " " + numbers[3] + numbers[4] + numbers[5];
      String secondNs = "-" + numbers[6] + numbers[7] + numbers[8] + numbers[9];
      
      phoneNumber = areaCode + firstNs + secondNs;
      
      return phoneNumber;
    }
  }