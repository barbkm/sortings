import javax.crypto.spec.PSource;
import java.util.List;
import java.util.Timer;

public class Runner {
    public static void main(String[] args) {

        System.out.println("wynik");
       int n = 5;
        Numbers randomNumber = new Numbers(n);
        List<Integer> numToSort = randomNumber.generatreNumbers();
        System.out.println("Numbers:  "+numToSort);

        SortingTypes sortingTypes = new SortingTypes(numToSort);
  //      long start = System.currentTimeMillis();
      System.out.println("Bubble sort: "+sortingTypes.bubbleSort());
    //   long end = System.currentTimeMillis()-start;
     //   System.out.println("Time_counter: "+end);
     //   long start2 = System.currentTimeMillis();
    //   System.out.println("Radix sort: "+sortingTypes.radixSort().toString());
     //  long end2 = System.currentTimeMillis()-start2;
     //   System.out.println("Time_counter: "+end2);
    }
}
