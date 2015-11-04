package Problem1;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable{
    public PlaneShape(double inputX, double inputY) {
        this.vertices = new Vertex2D[3];
        this.vertices[0] = new Vertex2D(inputX,inputY);
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    @Override
    public String toString(){
        return
                "Shape: " + this.getClass().getSimpleName() + "\n" +
                        "Area: " + this.getArea() + "\n" +
                        "Perimeter: " + this.getPerimeter() + "\n" +
                        super.toString();
    }
}
