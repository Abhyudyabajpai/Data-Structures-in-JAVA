
public class shell_sort {
    public static void main(String[] args) {
        int [] myarray ={12,-7,0,67,23};
        
        for(int gap= myarray.length/2;gap>0;gap/=2){

            for(int i= gap;i<myarray.length;i++){
                int newelement = myarray[i];

                int j=i;

                while(j>=gap && myarray[j-gap]> newelement){
                    myarray[j] = myarray[j-gap];
                    j -=gap;
                }
                myarray[j] =newelement;
            }
        }    
        for(int i=0;i<myarray.length;i++){
            System.out.println(myarray[i]);
        }
}
}