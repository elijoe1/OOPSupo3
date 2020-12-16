package uk.ac.cam.ej349;

public class Point implements Comparable<Point> {
    final double x;
    final double y;
    final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    @Override
    public int compareTo(Point o) {
        if (this.z > o.z) {
            return 1;
        } else if (this.z < o.z) {
            return -1;
        } else {
            if (this.y > o.y) {
                return 1;
            } else if (this.y < o.y) {
                return -1;
            } else {
                return Double.compare(this.x, o.x);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        Point e = (Point) o;
        return (x == e.x && y == e.y && z == e.z);
    }

    @Override
    public String toString() {
        return String.format("(%f, %f, %f)", x, y, z);
    }
}
