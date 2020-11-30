public class fact {
    /**
     * Innerfact
     */
    static int factorial(int n) {
        if(n==0){
            return 1;
        }
        else{
            return n*(factorial(n-1));
        }
        
    }
    public static void main(String[] args) {
        int num=6;
        System.out.println(factorial(num));
    }
    
}
