class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy Constructor
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
       
        Point p1 = new Point(10, 20);
        Point p2 = new Point(p1);
        p1.display(); 
        p2.display(); 
    }
}
