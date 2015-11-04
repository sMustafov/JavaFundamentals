package Problem1;

public abstract class Cuboid extends SpaceShape {
    private double width;
    private double depth;
    private double height;

    public Cuboid(double x, double y, double z, double width, double depth, double height) {
        super(x,y,z);
        this.setWidth(width);
        this.setDepth(depth);
        this.setHeight(height);
    }

    public void setWidth(double width){
        if (width < 0) {
            throw new IllegalArgumentException("The number must be bigger than 0!");
        }
        this.width = width;
    }
    public double getWidth(){
        return width;
    }

    public void setDepth(double depth){
        if (depth < 0) {
            throw new IllegalArgumentException("The number must be bigger than 0!");
        }
        this.depth = depth;
    }
    public double getDepth(){
        return depth;
    }

    public void setHeight(double height){
        if (height < 0) {
            throw new IllegalArgumentException("The number must be bigger than 0!");
        }
        this.height = height;
    }
    public double getHeight(){
        return height;
    }

    @Override
    public double getArea() {
        return (this.width * this.depth +
                this.width * this.height +
                this.height * this.depth);
    }

    @Override
    public double getVolume() {
        return this.width * this.height * this.depth;
    }
}
