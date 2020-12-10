class Rectangle extends Shape{
    private int length, width;

    public Rectangle(int length, int width, String color, boolean filled){
        super(color,filled);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() { return width * length; }

    @Override
    public double perimeter() { return (length + width) * 2; }

    @Override
    public String toString(){
        String areaChecked = area() % 1 == 0? String.format("%d",(int)area()) : String.format("%.2f",area());
        String perimeterChecked = perimeter() % 1 == 0?String.format("%d",(int)perimeter()) : String.format("%.2f",perimeter());
        String colored = filled? "Color: "+color : "";
        return String.format("Rectangle: length: %d, width: %d\nArea: %s\nPerimeter: %s\n%s",length,width,areaChecked,perimeterChecked,colored);
    }
}