public class ComparableCircle extends  Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {

    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled,radius);

    }
    public int compareTo(ComparableCircle circle) {
        if (getterRaius() < circle.getterRaius()) return 1;
        else if (getterRaius() > circle.getterRaius()) return -1;
        else return 0;
    }
}
