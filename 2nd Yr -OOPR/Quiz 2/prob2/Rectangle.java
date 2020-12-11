public class Rectangle{

    point topLeft;
    point botRight;

    double area;

    public Rectangle(){
        topLeft = new point(0,0);
        botRight = new point(0,0);
    }

    public Rectangle(int x, int y){
        topLeft = new point(0,0);
        botRight = new point(x,y);
    }

    public void display(){
        for (int y = topLeft.y; y <= botRight.y; y++){
            for(int x = topLeft.x; x <= botRight.x; x++)
                System.out.printf("%s",
                (y==0 || y == botRight.y || x == 0 || x == botRight.x)?"# ":"  ");
            System.out.println();
        }
        System.out.println();
    }

    public int area(){
        return botRight.x * botRight.y;
    }

    public int perimiter(){
        return (botRight.x+botRight.y) * 2;
    }

    public String centerPoint(){
        return String.format("(%.2f,%.2f)",botRight.x / 2.0, botRight.y / 2.0);
    }

    public boolean isSquare(){
        return botRight.x == botRight.y;
    }

}