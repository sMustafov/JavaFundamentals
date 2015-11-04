package Problem1;

public abstract class Triangle extends PlaneShape {
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        super(x1, y1);
        this.vertices[1] = new Vertex2D(x2, y2);
        this.vertices[2] = new Vertex2D(x3, y3);

        this.isValidTriangle();
    }

    @Override
    public double getArea() {
        double p = this.getPerimeter() * 0.5;
        double a = this.getDistanceBC();
        double b = this.getDistanceAC();
        double c = this.getDistanceAB();

        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return area;
    }
    @Override
    public double getPerimeter(){
        double p = this.getDistanceAB() + this.getDistanceAC() + this.getDistanceBC();

        return p;
    }

    public void isValidTriangle() {
        boolean AB = (this.getDistanceAC() + this.getDistanceBC() > this.getDistanceAB());
        boolean BC = (this.getDistanceAC() + this.getDistanceAB() > this.getDistanceBC());
        boolean AC = (this.getDistanceAB() + this.getDistanceBC() > this.getDistanceAC());

        boolean isTriangle = AB && AC && BC;

        if (!isTriangle) {
            throw new IllegalArgumentException("Can not create triangle!");
        }

    }

    public double getDistanceAB() {
        double distanceAB = Vertex.distance(this.vertices[0], this.vertices[1]);
        return distanceAB;
    }

    public double getDistanceBC() {
        double distanceBC = Vertex.distance(this.vertices[1], this.vertices[2]);
        return distanceBC;
    }

    public double getDistanceAC() {
        double distanceAC = Vertex.distance(this.vertices[0], this.vertices[2]);
        return distanceAC;
    }

    @Override
    public String toString() {
        return super.toString() +
                this.vertices[1].toString() +
                this.vertices[2].toString();
    }
}
