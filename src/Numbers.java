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

    //generowanie liczb
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

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getNumbersOFnumbers() {
        return numbersOFnumbers;
    }

    public void setNumbersOFnumbers(int numbersOFnumbers) {
        this.numbersOFnumbers = numbersOFnumbers;
    }
}
