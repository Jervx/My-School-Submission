abstract class Shape{

    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public abstract double area();
    public abstract double perimeter();
    public abstract String toString();
    
}