class Point extends Movable{
    public int x,y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void moveLeft(){
        if(x == 0)return;
        x--;
    }

    public void moveRight(){
        if(x == 200)return;
        x++;
    }

    public void moveUp(){
        if(y == 0)return;
        y--;
    }
    
    public void moveDown(){
        if(y == 200)return;
        y++;
    }

    public void display(){
        System.out.printf("Point: (%d,%d)",x,y);
    }
}