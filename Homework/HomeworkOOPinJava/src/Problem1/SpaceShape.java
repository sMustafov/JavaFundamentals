package Problem1;

public abstract class SpaceShape extends Shape implements VolumeMeasuarable, AreaMeasurable {
    public SpaceShape(double inputX, double inputY, double inputZ) {
        this.vertices = new Vertex3D[1];
        this.vertices[0] = new Vertex3D(inputX, inputY, inputZ);
    }

    public abstract double getArea();

    public abstract double getVolume();

    @Override
    public String toString() {
        return
                "Shape: " + this.getClass().getSimpleName() + "\n" +
                        "Area: " + this.getArea() + "\n" +
                        "Volume: " + this.getVolume() + "\n" +
                        super.toString();
    }
}


