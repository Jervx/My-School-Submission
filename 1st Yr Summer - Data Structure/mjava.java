import java.util.Scanner;

public class mjava {
    Scanner input = new Scanner(System.in);

    public void cStack(){
        stack stack = new stack(10);

        stack.push(5);
        stack.push(1);
        stack.push(3);
        stack.push(6);
        stack.push(11);
        stack.push(15);
        stack.push(21);
        stack.push(4);
        stack.push(7);
        stack.push(55);
        stack.push(32);
        System.out.println("---------------------");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
    
    public void cQueue(){
        queue que = new queue(5);
        que.enqueue(1);
        que.enqueue(3);
        que.enqueue(2);

        que.enqueue(5);
        que.enqueue(0);

        que.peek();
        que.peek();
        que.peek();

        que.deque();
        que.deque();
        que.deque();
        
        que.deque();
        que.deque();
        que.deque();

        que.enqueue(10);
        que.enqueue(5);
        que.enqueue(3);


        que.deque();
        que.deque();
        que.deque();
        que.deque();
    }

    public void fmain(){

    }

    public static void main(String [] args){
        mjava self = new mjava();
        self.fmain();
    }
}