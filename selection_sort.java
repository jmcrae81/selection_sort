// selection_sort.java

class selection_sort{

    int largestNumber = 0;
    int largestIndex = 0;
    int[] sorted;
    
    public static void main(String[] args){
        selection_sort sorter = new selection_sort();
        
        int[] unsorted = new int[4];
        sorter.sorted = new int[4];
        
        sorter.fillArray(unsorted, args);
        System.out.println("Unsorted: ");
        sorter.printArray(unsorted);

        sorter.sort(unsorted);
        System.out.println("Sorted: ");
        sorter.printArray(sorter.sorted); 

    }
    
    void printArray(int[] arrayToPrint){
        for(int k = 0; k < arrayToPrint.length; k++){
            System.out.print(arrayToPrint[k] + " ");
        }
        System.out.println();
    }

    void fillArray(int[] target, String[] source){
        for(int i = 0; i < source.length; i++){
            target[i] = Integer.parseInt(source[i]);
        }

    }

    void sort(int[] input){
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input.length; j++){
                if(input[j] > largestNumber){
                    largestNumber = input[j];
                    largestIndex = j;
                }
            }

            // reset control variables and add largest number(so far)
            input[largestIndex] = 0;
            sorted[i] = largestNumber;
            largestNumber = 0;
        }
    }
}

