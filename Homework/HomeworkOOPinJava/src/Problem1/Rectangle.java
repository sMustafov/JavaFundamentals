package Problem1;

public abstract class Rectangle extends PlaneShape{
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height){
        super(x,y);
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(double inputWidth){
        if (width < 0){
            throw new IllegalArgumentException("Width can't be 0 or negative number!");
        }
        this.width = inputWidth;
    }
    public double getWidth(){
        return this.width;
    }

    public void setHeight(double inputHeight){
        if (height < 0){
            throw new IllegalArgumentException("Height can't be 0 or negative number!");
        }
        this.height = inputHeight;
    }
    public double getHeight(){
        return this.height;
    }

    @Override
    public double getPerimeter(){
        double p = (2 * this.width) + (2 * this.height);
        return p;
    }

    @Override
    public double getArea() {
        double s = this.width * this.height;
        return s;
    }
}
