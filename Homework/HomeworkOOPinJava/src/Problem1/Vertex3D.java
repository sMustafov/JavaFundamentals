package Problem1;

public class Vertex3D extends Vertex{
    private double z;

    public void setZ(double inputZ){
        this.z = inputZ;
    }
    public double getZ (){
        return z;
    }
    public Vertex3D(double inputX, double inputY,double inputZ){
        super(inputX,inputY);
        this.z = inputZ;
    }

    @Override
    public String toString (){
        return super.toString() + "\n" + "Z = " + getZ();
    }
}
