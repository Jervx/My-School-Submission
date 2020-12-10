import java.util.Scanner;
import java.util.Stack;

class Main{
    boolean numberBaTo(String numbirXD){
        try{
            Integer.parseInt(numbirXD);
            return true;
        }catch(Exception e){ return false; }
    }

    public void newMainXD(){
        Scanner in = new Scanner(System.in);

        int ilanBa = in.nextInt();
        Stack <Integer> numbirsXD = new Stack<Integer>();
        
        in.nextLine();
        while(ilanBa-- > 0){
            try{
                String pstfx = in.nextLine();

                for(String S : pstfx.split("\\s")){
                    if(numbirsXD.isEmpty()){
                        numbirsXD.push(Integer.parseInt(S));
                        continue;
                    }else if(numberBaTo(S)){
                        numbirsXD.push(Integer.parseInt(S));
                        continue;
                    }
                    
                    char operitursXD = S.charAt(0);

                    int kuhaXD = numbirsXD.pop();
                    int kuhaUletXD = numbirsXD.pop();

                    if(operitursXD == '+') numbirsXD.push(kuhaUletXD + kuhaXD);
                    else if(operitursXD == '-') numbirsXD.push(kuhaUletXD - kuhaXD);
                    else if(operitursXD == '*') numbirsXD.push(kuhaUletXD * kuhaXD);
                    else if(operitursXD == '/'){
                        if(kuhaXD == 0) throw new Exception("Division by 0 Error");
                        numbirsXD.push(kuhaUletXD / kuhaXD);
                    }
                }   
                System.out.println("Output: "+numbirsXD.pop());
            }catch(Exception e){
                System.out.println("Output: "+e.getMessage());
            }
        }

    }

    public static void main(String [] jervx){ new Main().newMainXD();}

}