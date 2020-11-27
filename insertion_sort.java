public class insertion_sort {
    public static void main(String[] args) {
        int[] myArray = {12,-7,0,67,23};

        for(int firstIndex=1;firstIndex<myArray.length;
            firstIndex++){
                int newelement = myArray[firstIndex];
                int i;
                for(i=firstIndex;i>0 && myArray[i-1]>newelement;i--){
                    myArray[i] = myArray[i-1];
                }
                myArray[i] = newelement;
            }
        for(int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
    }
    
}
