
public class selection_sort {
    public static void main(String[] args) {
        
    int [] myArray = {12,-7,0,67,23};

    for(int lastindex = myArray.length-1;lastindex>0;
    lastindex--){

        int largest = 0;
        for(int i=1;i<=lastindex;i++){ 
            if(myArray[i]> myArray[largest]){
                largest =i;
            }
        }
        swap(myArray,largest,lastindex);
    }
    for (int i=0;i<myArray.length;i++){
        System.out.println(myArray[i]);
    }
    }
    public static void swap(int[]array,int i,int j) {
        if(i==j){
            return;
        }
        int temp ; 
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        }
}