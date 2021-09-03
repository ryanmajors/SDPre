public class Objective3Lab2 {
  public static void main(String[] args) {
    double side1, side2, hypotenuse, s1s2;
    side1 = 10;
    side2 = 8;
    s1s2 = (side1 * side1) + (side2 * side2);
    hypotenuse = Math.sqrt(s1s2);
    System.out.println("The hypotenuse of the triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse);

  }
}
