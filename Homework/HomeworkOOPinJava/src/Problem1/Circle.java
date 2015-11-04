package Problem1;

public class Circle extends PlaneShape{
    private double radius;
    public Circle(double x, double y, double radius){
        super(x,y);
        this.radius = radius;
    }

    public void setRadius(double inputRadius){
        if (radius < 0){
            throw new IllegalArgumentException("The radius can't be 0 or negative number");
        }
        this.radius = inputRadius;
    }
    public double getRadius(){
        return this.radius;
    }

    @Override
    public double getPerimeter(){
        double p = 2.0 * Math.PI * this.radius;
        return p;
    }

    @Override
    public double getArea(){
        double a = 2.0 * (this.radius * this.radius);
        return a;
    }
}
