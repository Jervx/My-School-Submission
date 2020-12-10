import java.util.Scanner;
import java.util.Stack;

class Main{
    public static void main(String [] jervx){
        Stack<Character>stack = new Stack<Character>();
        String input = new Scanner(System.in).next();

        for(char C : input.toCharArray()){
            if(stack.isEmpty()){
                stack.add(C);
                continue;
            }else if(stack.peek() != C){
                stack.pop();
                continue;
            }
            stack.add(C);
        }
        System.out.println(stack.isEmpty()?"Balanced":"Not Balanced");
        System.out.print("The contents of the Stack are: ");   
        for(int x = 0; x < stack.size(); x++)
                System.out.print(stack.get(x));
    }
}