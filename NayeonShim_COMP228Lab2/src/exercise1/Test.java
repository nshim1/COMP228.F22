package exercise1;
import java.util.Random;
import javax.swing.JOptionPane;

public class Test {
    String[] questions;
    String[] answers;
    int total;
    public Test() {
        questions = new String[5];
        answers = new String[5];
        questions[0] = "which of the following is appropriate about method overloading?\n" +
                "(a)Methods of the different modifier\n" +
                "(b)Methods of the same name and same sets of parameters.\n" +
                "(c)Methods of the same name and different sets of parameters.\n" +
                "(d)Methods of the different name and same sets of parameters.\n";
        answers[0] = "c";
        questions[1] = "Which of the following statements BEST describes about static keyword?\n" +
                "(a)We can't apply static with variable.\n" +
                "(b)The static keyword belongs to the class.\n" +
                "(c)Static method needs object reference.\n" +
                "(d)Variable with static keyword will get memory each time when the instance is created.\n";
        answers[1] = "b";
        questions[2] = "Which of the following variables has different type?\n" + "(a)String\n" + "(b)char\n" + "(c)int\n" + "(d)boolean";
        answers[2] = "a";
        questions[3] = "Choose the correct syntax of using Array in Java:\n" +
                "(a)foreach <elementName> in <arrayName>\n" +
                "(b)for(int[] <arrayName>)\n" +
                "(c)for <elementName> in <arrayName>\n" +
                "(d)for(int <elementName>: <arrayName>)\n";
        answers[3] = "d";
        questions[4] = "Which of the following has the highest type?\n" + "(a)float\n" + "(b)double\n" + "(c)long\n" + "(d)int";
        answers[4] = "b";
        total = 0;
    }

    public String simulateQuestion(int idx)
    {
        return JOptionPane.showInputDialog(questions[idx]);
    }

    public void inputAnswer() {
        String ans;
        for(int i =0; i<questions.length; i++){
            ans = simulateQuestion(i);
            if(checkAnswer(ans, answers[i])){
                generateMessage(true,"");
                total +=1;
            }else{
                generateMessage(false, answers[i]);
            }
        }
        String finalMessage = String.format("Great Work! You have %d marks/5(total).\n", total) + String.format("%d percent of the correct answer.", total * 100 / questions.length);
        JOptionPane.showMessageDialog(null, finalMessage);

    }

    public boolean checkAnswer(String ans, String correctAns) {
        return ans.equals(correctAns.toLowerCase());
    }

    public void generateMessage(boolean isCorrect,String correctAns) {
        Random randomObject = new Random();
        String[] correctMessages = {"Perfect!", "Genius", "Nice Work!", "Excellent!"};
        String[] wrongMessages = {"Wrong answer", "Try one more", "Please try again", "Incorrect. Keep trying"};
        int randNum = randomObject.nextInt(4);
        String rightAnsMessage = String.format("\ncorrect answer: %s",correctAns);
        if (isCorrect) {
            switch (randNum) {
                case 0:
                    JOptionPane.showMessageDialog(null, correctMessages[0]);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, correctMessages[1]);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, correctMessages[2]);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, correctMessages[3]);
                    break;

            }
        } else {
            switch (randNum) {
                case 0:
                    JOptionPane.showMessageDialog(null, wrongMessages[0]+rightAnsMessage);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, wrongMessages[1]+rightAnsMessage);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, wrongMessages[2]+rightAnsMessage);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, wrongMessages[3]+rightAnsMessage);
                    break;


            }
        }


    }

}

