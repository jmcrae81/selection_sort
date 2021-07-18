// selection_sort.java
import java.util.*;

class selection_sort{

    int largestNumber = 0;
    int largestIndex = 0;
    ArrayList sorted;
    
    public static void main(String[] args){
        selection_sort sorter = new selection_sort();
    
        // build list with command line arguments    
        ArrayList unsorted = new ArrayList(args.length);
        sorter.sorted = new ArrayList(args.length);
        
        sorter.fillList(unsorted, args);
        System.out.println("Unsorted: ");
        sorter.printList(unsorted);

        sorter.sortLowToHigh(unsorted);
        System.out.println("Sorted: ");
        sorter.printList(sorter.sorted); 

    }
    
    void printList(ArrayList arrayToPrint){
        for(int k = 0; k < arrayToPrint.size(); k++){
            System.out.print(arrayToPrint.get(k) + " ");
        }
        System.out.println();
    }

    void fillList(ArrayList target, String[] source){
        for(int i = 0; i < source.length; i++){
            target.add(Integer.parseInt(source[i]) );
        }

    }

    void sortLowToHigh(ArrayList input){
        int smallestNumber = 0;

        while( input.size() != 0 ){
            smallestNumber = findSmallest(input);
            sorted.add(smallestNumber);
        } 
    }

    int findSmallest(ArrayList theList){
        int lowestNumber = (int) theList.get(0);
        int indexOfLowest = 0;

        for(int i = 0; i < theList.size(); i++){
            if( ( (int) theList.get(i) ) < lowestNumber ){
                lowestNumber = (int) theList.get(i);
                indexOfLowest = i;
            }
        }

        theList.remove(indexOfLowest);
        return lowestNumber;
    }


    void sortHightoLow(ArrayList input){
       while( input.size() != 0){
           largestNumber = findLargest(input);
           sorted.add(largestNumber);
       }
    }
    
    int findLargest(ArrayList currentList){
        int currentLargest = (int) currentList.get(0);
        int indexOfLargest = 0;

        for(int i = 0; i < currentList.size(); i++){
            if( ( (int) currentList.get(i)) > currentLargest){
                currentLargest = (int) currentList.get(i);
                indexOfLargest = i;
            }
        }

        currentList.remove(indexOfLargest);

        return currentLargest;
    }
}
