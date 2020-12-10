
public class stack {
    int size;
    int data[];

    int top = -1;
    
    public stack(int size){
        this.size = size;
        data = new int[size];
    }

    public void push(int data){
        if(isFull()){
            System.out.println("The stack is full, Can't put "+data+" to the stack!");
            return;
        }
        this.data[++top] = data;
        System.out.printf("%-2d added to the stack! Stack -> %s \n",data, getInlineStringData());
    }

    public String getInlineStringData(){
        String str = "[";
        for(int x = 0 ; x < top+1; x++) str += data[x] + (x+1 == top+1 ? "":", ");
        return str+"]";
    }

    public void pop(){ 
        if(isEmpty()){
            System.out.println("No more data on stack");
            return;
        }
        System.out.printf("%-2d Stack-> %s\n",data[top--],getInlineStringData()); 
    }

    public boolean isEmpty(){ return top < 0; }

    public boolean isFull(){ return top == data.length - 1;}

}