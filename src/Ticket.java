import java.sql.SQLOutput;
import java.util.Arrays;

public class Ticket {
    private final int[] lottoNumbers;
    public Ticket(){
        lottoNumbers = new int[6];
    }

    private void generateTicket(){
        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = i;
        }
    }

    public void display(){
        System.out.println(Arrays.toString(lottoNumbers));
    }
}
