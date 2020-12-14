/** 
 * OOPR Quiz Program Final Project 
 * GroupMates/Members
     @ 🦊 Castro
     @ 🐱 Paragas
     @ 🐯 Sarte 
 * */ 

import java.util.Scanner;

class Main{

    public static void main(String [] args){
        String questions [][] = {
            {
                "What keyword are use to declare Integer in java?",
                "what keyword are use to declare a floating point in java?",
                "True or False: Java is not case sensitive.",
                "True or False: Codechum server uses linux",
                "True or False: Twitter logo is a bird",
                "True or False: Mitochondria is the powerhouse of a cell",
                "True or False: Roses Are Red Violets are Blue, bakit sobrang rupok ko pagdating sa U",
                "Enter the missing word: Wah me and my jowa ___ uuwi na sya uuwi na sya wah maghahanap ng iba",
                "What is the national fruit of the Philippines",
                "Enter the missing word: kapag lumingon ka, akin __",
                "True or False: Gwapo si Andrei Castro",
                "True or False: National Hero of the Philippines is Dr. Jose Rizal",
                "True or False: Lapu-Lapu killed Magellan",
                "True or False: Hiroshima was bombed by the US",
                "Bonus: Just Type true"
            },
            {
                "1+1=?",
                "2+2=?",
                "5 factorial =?",
                "2^2=?",
                "12/2=?",
                "True or false: we can use return inside a void function",
                "True or false: Java is a High level programming language",
                "How many teeth humans have?",
                "Capital of Japan",
                "Capital of Philippines"
            },
            {
                "True or false? Burning is physical change. ",
                "What is the atomic number of Titanium",
                "True or false? Electrons are smaller than atoms.",
                "True or false? Antibiotics kill viruses as well as bacteria.",
                "True or false? All radioactivity is man-made",
                "True or false? Newton's second law is often stated as F=ma"
            }
        };
        String answers [][] = {
            {"int","float","false","true","true","true","true","wah","Mango","ka","true","true","true","true","true"},
            {"2","4","120","4","6","true","true","32","Tokyo","Manila"},
            {"false","22","true","false","false","true"}
        };

        Scanner inpt = new Scanner(System.in);
        
        while(true){
            System.out.print("\n\n\n\n\n\n\n\n 📝 Choose Quiz Type 📝 \n\n"+
            "  1 ❯ Easy Quiz\n"+
            "  2 ❯ Medium Quiz\n"+
            "  3 ❯ Hard Quiz\n"+
            "  0 ❯ Exit \n\n❯ Your Choice ❯ ");

            int option = inpt.nextInt();
            if(option == 0) break;

            Quiz quiz = new Quiz(inpt, questions[option - 1], answers[option - 1], option - 1);

            quiz.startQuiz();
            quiz.display();

            System.out.print("\n What do you want to do? \n\n"+
            "  1 ❯ Take a new Quiz\n"+
            "  0 ❯ Exit \n ❯ Your Choice ❯ ");
            option = inpt.nextInt();

            if(option == 0) break;
        }

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n❯ Quiz Program Terminated 💤 ");
    }
}