public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;
    String oor = "odd";

      while(counter <= 20) {
        System.out.println(counter + " is " + oor);
        counter = counter + 1;
        if(counter % 2 ==0) {
          oor = "even";
        }
        else {
          oor = "odd";
      }
    }

  }
}
