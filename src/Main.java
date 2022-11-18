public class Main {

    static int func(int a, int b, int c){
         int z = ((b-3)*b/2)+c;
        System.out.println(z);
        return z;
    }

    public static void main(String[] args) {
        func(11,22,33);
    }
}