import java.util.Scanner;

public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum;
      int zero = 0;

      System.out.println("Please enter a number: ");
      userNum = scanner.nextInt();

      if(userNum > zero) {
        System.out.println("This number is positive");
      }
      else if(userNum == zero) {
        System.out.println("This number is neither positive nor negative");
      }
      else{
        System.out.println("This number is negative");
      }
      scanner.close();
  }
}
