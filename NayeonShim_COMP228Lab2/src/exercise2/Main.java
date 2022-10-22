package exercise2;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        int sum = lotto.sumNum();
        int userInput;
        for (int i = 0; i < 5; i++) {
                userInput = Integer.parseInt(JOptionPane.showInputDialog(String.format("%d: Please input any number(3 ~ 27)\n", i + 1)));
                if(i>0){
                    lotto.rollLotto();
                }
                if (userInput == sum) {
                    String winningMsg = String.format("Congratulation! You chose %d number and the winning number was %d.",userInput,sum);
                    JOptionPane.showMessageDialog(null, winningMsg );
                    System.exit(0);
                }else{
                    String reRollMsg = String.format("Roll again! You chose %d number and the winning number was %d.",userInput,sum);
                    JOptionPane.showMessageDialog(null,reRollMsg);
                }

        }
        String loseMsg = String.format("Better luck next time!");
        JOptionPane.showMessageDialog(null,loseMsg);


    }


}

