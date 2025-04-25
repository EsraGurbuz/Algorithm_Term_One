
import java.util.ArrayList;

public class GurbuzEsraLab10 {
    public static void main(String[] args){
        ArrayList<String> namesForSelectionSort = new ArrayList<String>();
        namesForSelectionSort.add("Thorin");
        namesForSelectionSort.add("Bilbo");
        namesForSelectionSort.add("Gandalf");
        namesForSelectionSort.add("Kili");
        namesForSelectionSort.add("Fili");
        namesForSelectionSort.add("Gloin");
        namesForSelectionSort.add("Oin");
        namesForSelectionSort.add("Balin");

        //Selection Sort
        int selectionSwapCount = 0;

        for(int index = 0; index < namesForSelectionSort.size() - 1 ; index++){
            int min = index;

            for(int k = index + 1; k < namesForSelectionSort.size(); k++){
                if(namesForSelectionSort.get(k).length() < namesForSelectionSort.get(min).length()){
                    min = k;
                }
            }

            if(min != index){
                String temp = namesForSelectionSort.get(index);
                namesForSelectionSort.set(index, namesForSelectionSort.get(min));
                namesForSelectionSort.set(min, temp);
                selectionSwapCount++;
            }
        }

		System.out.println("Selection sort");
        System.out.println("The swap count is " + selectionSwapCount);
        System.out.println(namesForSelectionSort);

        //Bubble Sort


        ArrayList<String> namesForBubbleSort = new ArrayList<String>();
        namesForBubbleSort.add("Thorin");
        namesForBubbleSort.add("Bilbo");
        namesForBubbleSort.add("Gandalf");
        namesForBubbleSort.add("Kili");
        namesForBubbleSort.add("Fili");
        namesForBubbleSort.add("Gloin");
        namesForBubbleSort.add("Oin");
        namesForBubbleSort.add("Balin");

        int bubbleSwapCount = 0;
        boolean swapped = false;

        do {
            swapped = false;
            for(int i = 0; i < namesForBubbleSort.size() - 1; i++){
                if(namesForBubbleSort.get(i).length() > namesForBubbleSort.get(i + 1).length()){
                    String temp = namesForBubbleSort.get(i);
                    namesForBubbleSort.set(i, namesForBubbleSort.get(i + 1));
                    namesForBubbleSort.set(i + 1, temp);
                    bubbleSwapCount++;
                    swapped = true;

                }
            }
        } while (swapped);

		System.out.println("Bubble sort");
        System.out.println("The bubble sort swap count: " + bubbleSwapCount);
        System.out.println(namesForBubbleSort);
    }
}
