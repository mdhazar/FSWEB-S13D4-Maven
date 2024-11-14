package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point p) {
        return Math.sqrt((p.x - this.x) * (p.x - this.x) +
                (p.y - this.y) * (p.y - this.y));
    }

    public double distance(int a, int b) {
        return Math.sqrt((a - this.x) * (a - this.x) +
                (b - this.y) * (b - this.y));
    }

    public static void main(String[] args) {
        Point point1 = new Point(2, 3);
        Point point2 = new Point(5, 7);

        System.out.println(point1.distance());
        System.out.println(point1.distance(point2));
        System.out.println(point1.distance(4, 6));
    }
}