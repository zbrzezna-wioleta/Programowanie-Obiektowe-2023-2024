public class TestPoint {
    public static void main(String[] args) {
        // Przypadek testowy
        Point point1 = new Point();
        point1.x=1;
        point1.y=2;
        Point point2 = new Point();
        point2.x=4;
        point2.y=6;
        double distance = point1.distance(point2);

        System.out.printf("Odległość między punktem 1 a punktem 2 wynosi " + distance);
    }
}
class Point{
    double x;
    double y;
    double distance(Point otherPoint){
        double dx=this.x - otherPoint.x;
        double dy=this.y - otherPoint.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}