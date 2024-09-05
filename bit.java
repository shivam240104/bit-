public class bit{

    public static void evenOdd(int n){
       
        if((n & 1)==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
    public static void main(String[] args) {
       evenOdd(2);
       evenOdd(32);
       evenOdd(25);
    }
}