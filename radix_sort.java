
// makes assumptions
// data must have same radix and width
// start with right most position
// use stable sort algorithm

public class radix_sort {
    public static void main(String[] args) {
        int[] myArray = {2346,7843,1209,5123,6754};       
        radixSort(myArray,10,4);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static void radixSort(int[] input,int radix,int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input,i,radix);
            
        }
        
    }
    public static void radixSingleSort(int[] input,int position,int radix) {
        int numItems = input.length;
        int [] countArray = new int[radix];

        for(int value: input){
            countArray[getDigit(position,value,radix)]++;
        }
        for(int j=1;j<radix;j++){
            countArray[j] += countArray[j-1];
        }
        int[] temp = new int[numItems];
        for(int tempIndex= numItems-1; tempIndex>=0;tempIndex--){
            temp[--countArray[getDigit(position, input[tempIndex], radix)]]= input[tempIndex];
        }

        for(int tempIndex=0;tempIndex<numItems;tempIndex++){
            input[tempIndex] = temp[tempIndex];

        }
        
    }
    public static int getDigit(int position,int value,int radix) {
        return value/(int) Math.pow(radix,position)% radix;
        
    }
}
