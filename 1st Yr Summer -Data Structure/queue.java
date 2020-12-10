

public class queue {

    int size;
    int size2;

    int [] data;
    int p1 = -1;
    int p2 = -1;

    public queue(int size){
        this.size = size;
        data = new int[size];
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("The queue is full. cannot add "+data);
            return;
        }
        if(p1 < 0) p1 = 0;
        System.out.println("Enqueue : "+data);
        size2++;
        this.data[++p2] = data;
    }

    public void deque(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            p1 = -1;
            p2 = -1;
            size2 = 0;
            return;
        }
        System.out.println("Deque : "+data[p1++]);
    }

    public void peek(){ System.out.println("peek view: "+data[p1]); }

    public boolean isFull(){ return p2 == size-1; }

    public boolean isEmpty(){ return p1 == -1 || p1 == size2; }
    
}