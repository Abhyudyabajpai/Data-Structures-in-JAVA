// makes assumptions and no comparisions
// Can't sort negative values
// Limited to small sized arrays 

public class counting_sort {
    public static void main(String[] args) {
        
        int [] myArray = {12,7,91,67,23};
        countSort(myArray,1,5);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static void countSort(int[] input, int min, int max) {
        
        int[] countArray = new int[(max-min)+1];
            
        for(int i=0;i<input.length;i++){
            countArray[input[i]-min]++;
        }
        int j=0;
        for (int i = min; i <= max; i++) {
            while(countArray[i-min]>0){
                input[j++]=i;
                countArray[i - min]--;
            }      
        }
    }
}