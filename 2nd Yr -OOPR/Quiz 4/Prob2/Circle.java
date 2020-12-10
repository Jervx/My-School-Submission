class Circle extends Movable{
    public int x,y,radius;

    public Circle(int x,int y,int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void moveLeft(){
        if(x-radius == 0)return;
        x--;
    }

    public void moveRight(){
        if(x+radius == 200)return;
        x++;
    }

    public void moveUp(){
        if(y-radius == 0)return;
        y--;
    }
    
    public void moveDown(){
        if(y-radius == 200)return;
        y++;
    }
    
    public void display(){
        System.out.printf("Circle: (%d,%d), %d",x,y,radius);
    }
}