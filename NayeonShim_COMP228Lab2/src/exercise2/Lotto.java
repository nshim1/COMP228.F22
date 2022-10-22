package exercise2;
import java.util.Random;
import javax.swing.JOptionPane;

public class Lotto {
    private int[] numbers;
    public Lotto(){
        rollLotto();
    }
    public void rollLotto(){
        numbers = new int[3];
        Random random = new Random();
        for(int i =0;i<numbers.length;i++){
            numbers[i]= random.nextInt(10)+1;
        }
    }
    public int sumNum(){
        int sum =0;
        for (int number: numbers ){
            sum += number;
        }
        return sum;
    }
    public int[] getNumbers(){
        return numbers;
    }
}
