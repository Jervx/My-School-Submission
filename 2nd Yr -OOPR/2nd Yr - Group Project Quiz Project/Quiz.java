import java.util.Scanner;

public class Quiz {

    private Scanner inpt;
    private String difficulty;
    private String question [], answer [],mistakes [];
    private int score,mistake;
    
    public void delay(int ms){try{Thread.sleep(ms);}catch(Exception e){}}
    public void print(int ms,String m){
        for(char t : m.toCharArray()){System.out.print(t);delay(ms);}
    }

    public Quiz(Scanner inpt, String [] question, String [] answer,int difficulty){
        this.inpt = inpt;
        this.question = question;
        this.answer = answer;
        this.score = 0;
        this.mistake = 0;
        mistakes = new String[question.length];
        if(difficulty == 0) this.difficulty = "😎 Easy";
        else if(difficulty == 1) this.difficulty = "😐 Normal";
        else if(difficulty == 2) this.difficulty = "💢 Hard";
    }

    public void startQuiz(){
        System.out.println("\n\n\n "+difficulty+" Quiz Started ⏳ Goodluck😉!  \n");
        for(int x = 0; x < question.length; x++){
            print(10," "+(x+1)+" ❯ "+question[x]+" : ");
            String uAnswer = inpt.next();
            if(uAnswer.equalsIgnoreCase(answer[x])) score++;
            else{
                mistakes[mistake++] = "    # "+(x+1)+" ❯ Correct Answer is : "+answer[x];
            }
        }
        print(30,"\n❯ Quiz Complete! ✔\n");
        delay(500);
    }

    public void display(){
        print(10,this.toString());
        delay(800);
    }

    public String toString(){
        String mistakesTostr = "";
        for(int x = 0; x < mistake; x++)
            mistakesTostr += mistakes[x]+"\n";
        return String.format(
            "\n\n✨ ✨ ✨ ✨ Quiz Summary ✨ ✨ ✨ ✨\n\n"+
            " ⚪ No. of Questions : %d\n"+
            " 😕 No. of Wrong Answer : %d\n"+
            " 😄 No. of Correct Answer : %d\n"+
            " 🔥 Grade : %.2f%% 🔥\n\n"+
            " ✨ Correct Answer for your %d mistake ✨\n%s\n\n",
            question.length,mistake,score,(double)score/question.length*100,mistake,mistakesTostr);
    }
}