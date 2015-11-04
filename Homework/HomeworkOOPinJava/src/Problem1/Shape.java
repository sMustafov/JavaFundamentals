package Problem1;

public abstract class Shape {
    protected Vertex [] vertices;

    public Vertex[] getVertices(){
        return vertices;
    }
    public void setVertices(Vertex[] inputVertices){
        this.vertices = inputVertices;
    }
    public Shape(){
        this.vertices = new Vertex[1];
    }

}
