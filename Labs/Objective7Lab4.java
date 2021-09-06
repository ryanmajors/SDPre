public class Objective7Lab4 {
  public static void main(String[] args) {
    int sum, count;
    sum = 0;
    count = 0;

    while(count <= 20) {
      count = count + 1;
      sum = count + sum;
      if(count == 20) {
        System.out.println(sum);
      }
    }
  }
}
