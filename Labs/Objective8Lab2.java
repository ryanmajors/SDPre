public class Objective8Lab2 {
  public static void main(String[] args) {
    int sum = 0;

    for(int control = 1; control <=20; control++) {
      sum = control + sum;
      if(control == 20) {
        System.out.println(sum);
      }
    }

  }
}
