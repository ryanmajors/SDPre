public class Objective8Lab3 {
  public static void main(String[] args) {
    String ooe = "odd";

    for(int counter = 1; counter <= 20; counter ++) {
      System.out.println(counter + " is " + ooe);
      if(counter % 2 == 0) {
        ooe = "odd";
      }
      else {
        ooe = "even";

      /*confused as to why this if statement is
      generating the opposite for odd and even,
      but my output is correct.
     */
      }
    }
  }
}
