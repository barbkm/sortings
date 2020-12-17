import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Numbers {
    private List<Integer> numbers;
    private int numbersOFnumbers;

    public Numbers(int numbersOFnumbers) {
        this.numbersOFnumbers = numbersOFnumbers;
        numbers = new ArrayList<>();
    }

    //generowaie liczb
    public List<Integer>generatreNumbers(){
        Random random = new Random();
        List<Integer>generatedNumbers = new ArrayList<>();
        while (numbersOFnumbers!=0){
            int number = (int) (random.nextDouble()*100);
            generatedNumbers.add(number);
            --numbersOFnumbers;
        }
        return generatedNumbers;
    }
}
