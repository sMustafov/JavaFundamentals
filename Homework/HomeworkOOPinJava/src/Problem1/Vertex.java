package Problem1;

public abstract class Vertex {
    private double x;
    private double y;

    public void setX (double inputX){
        this.x = inputX;
    }
    public double getX (){
        return x;
    }
    public void setY(double inputY){
        this.y = inputY;
    }
    public double getY(){
        return y;
    }
    public Vertex(double inputX, double inputY){
        this.setX(inputX);
        this.setY(inputY);
    }
    public static double distance (Vertex...vertices){
        double sum = 0;
        for (int i = 1; i <= vertices.length; i++ ){
            double c = Math.sqrt(Math.pow((vertices[i].getX() - vertices[i-1].getX()),2) +
                    Math.pow((vertices[i].getY() - vertices[i-1].getY()),2));
            sum += c;
        }
        return sum;
    }

    public String toString(){
        return "X = " + this.getX() + "\n" + "Y = " + this.getY();
    }
}
