class Circle extends Shape{
    private int Radius;

    public Circle(int Radius, String color, boolean filled){
        super(color,filled);
        this.Radius = Radius;
    }

    @Override
    public double area() { return Math.PI * Radius * Radius; }

    @Override
    public double perimeter() { return 0; }

    @Override
    public String toString(){
        String areaChecked = (area() % 1 == 0)? String.format("%d",(int)area()) : String.format("%.2f",area());
        return String.format("Circle: radius: %d\nArea: %s%s",Radius,areaChecked,filled?"\nColor: "+color:"");
    }
}