import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles =new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle( "indigo", false,3.5);
  for (Circle circle:circles)
  {
      System.out.println(circle);
  }
        Arrays.sort(circles);
        for (Circle circle:circles)
        {
            System.out.println(circle);
        }
    }
}