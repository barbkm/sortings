import javax.crypto.spec.PSource;
import java.util.Timer;

public class Runner {
    public static void main(String[] args) {

        System.out.println("wynik");
       int n = 5;
        Numbers randomNumber = new Numbers(n);
       SortingTypes sortingTypes = new SortingTypes(randomNumber.generatreNumbers());
        System.out.println("Numbers:  "+sortingTypes.getNumbersToSort().toString());
        long start = System.currentTimeMillis();
       System.out.println("Bubble sort: "+sortingTypes.bubbleSort().toString());
       long end = System.currentTimeMillis()-start;
        System.out.println("Time_counter: "+end);
        long start2 = System.currentTimeMillis();
       System.out.println("Radix sort: "+sortingTypes.radixSort().toString());
       long end2 = System.currentTimeMillis()-start2;
        System.out.println("Time_counter: "+end2);
    }
}
