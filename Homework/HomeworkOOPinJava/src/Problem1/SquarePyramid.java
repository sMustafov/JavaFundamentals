package Problem1;

public abstract class SquarePyramid extends SpaceShape {
    private double baseWidth;
    private double height;
    private double pyramidHeight;

    public SquarePyramid(double x, double y, double z,
                         double baseWidth, double height, double pyramidHeight){
        super(x,y,z);
        this.setBaseWidth(baseWidth);
        this.setHeight(height);
        this.setPyramidHeight(pyramidHeight);
    }

    public void setBaseWidth(double baseWidth){
        if (baseWidth < 0) {
            throw new IllegalArgumentException("The number must be bigger than 0!");
        }
        this.baseWidth = baseWidth;
    }
    public double getBaseWidth(){
        return this.baseWidth;
    }

    public void setHeight(double height){
        if (height < 0) {
            throw new IllegalArgumentException("The number must be bigger than 0!");
        }
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }

    public void setPyramidHeight(double pyramidHeight){
        if (pyramidHeight < 0) {
            throw new IllegalArgumentException("The number must be bigger than 0!");
        }
        this.pyramidHeight = pyramidHeight;
    }
    public double getPyramidHeight(){
        return this.pyramidHeight;
    }

    @Override
    public double getArea() {
        double faceArea = (1.0 / 2.0) * (4 * this.baseWidth) * this.height;
        double baseArea = this.baseWidth * this.baseWidth;

        return faceArea + baseArea;
    }

    @Override
    public double getVolume() {

        double v = (1.0 / 3.0) * (this.baseWidth * this.baseWidth) * this.height;
        return v;
    }

}
