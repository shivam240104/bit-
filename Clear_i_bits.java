public class Clear_i_bits {
    public static int clear(int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clear(10, 2));
    }
}
