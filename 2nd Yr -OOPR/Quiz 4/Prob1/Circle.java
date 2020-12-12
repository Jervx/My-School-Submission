class Circle extends Shape{

    private int Radius;

    public Circle(int Radius, String color, boolean filled){
        super(color,filled);
        this.Radius = Radius;
    }

    @Override
    public double area(){ return Math.PI * Radius * Radius; }

    @Override
    public double perimeter(){ return 2 * Math.PI * Radius; }

    @Override
    public String toString(){
        String areaChecked = (area() % 1 == 0)? String.format("%d",(int)area()):String.format("%.2f",area());
        String perimeterChecked = perimeter() % 1 == 0? String.format("%d",(int)perimeter()) : String.format("%.2f",perimeter());
        String colored = filled? "\nColor: "+color:"";
        return String.format("Circle: radius: %d\nArea: %s\nPerimeter: %s%s",Radius,areaChecked,perimeterChecked,colored);
    }

}