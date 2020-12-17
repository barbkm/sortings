import java.util.ArrayList;
import java.util.List;
// komentarze
public class SortingTypes {
    private List<Integer> numbersToSort;

    public SortingTypes(List<Integer> numbersToSort) {
        this.numbersToSort = numbersToSort;
    }

    public List<Integer> bubbleSort() {
        List<Integer> sortNumbers = new ArrayList<>();
        boolean sortFlag = true;
        sortNumbers = numbersToSort;
        while (sortFlag) {
            int n = 0;
            int changeCounter = 0;
            while (n + 1 < sortNumbers.size()) {
                if (sortNumbers.get(n) > sortNumbers.get(n + 1)) {
                    int temp = sortNumbers.get(n);
                    sortNumbers.set(n, sortNumbers.get(n + 1));
                    sortNumbers.set(n + 1, temp);
                    changeCounter++;
                }
                ++n;
            }
            if (changeCounter ==0)
                sortFlag=false;
        }
        return sortNumbers;
    }

    public List<Integer> radixSort(){
        List<Integer> sortedNumsR = new ArrayList<>();
        sortedNumsR = numbersToSort;
        //sortowanie jednosci
        boolean sortFlag = true;
        while (sortFlag) {
            int n = 0;
            int changeCounter = 0;
            while (n + 1 < sortedNumsR.size()) {
                if (sortedNumsR.get(n) % 10 > sortedNumsR.get(n + 1) % 10) {
                    int temp = sortedNumsR.get(n);
                    sortedNumsR.set(n, sortedNumsR.get(n + 1));
                    sortedNumsR.set(n + 1, temp);
                    changeCounter++;
                }
                ++n;
            }
            if (changeCounter == 0)
                sortFlag = false;
        }
            boolean sortFlagNum = true;
            while (sortFlagNum) {
                int n2 = 0;
                int changeCounter2 = 0;
                while (n2 + 1 < sortedNumsR.size()) {
                    if (sortedNumsR.get(n2) > sortedNumsR.get(n2 + 1) ) {
                        int temp = sortedNumsR.get(n2);
                        sortedNumsR.set(n2, sortedNumsR.get(n2 + 1));
                        sortedNumsR.set(n2 + 1, temp);
                        changeCounter2++;
                    }
                    ++n2;
                }
                if (changeCounter2 == 0)
                    sortFlagNum = false;
            }
            return sortedNumsR;
        }

    public List<Integer> getNumbersToSort() {
        return numbersToSort;
    }

    public List<Integer> mergeSort(){
        List<Integer> sortedNumsM = new ArrayList<>();
        sortedNumsM = numbersToSort;

        return sortedNumsM;
    }

    public void setNumbersToSort(List<Integer> numbersToSort) {
        this.numbersToSort = numbersToSort;
    }
}
