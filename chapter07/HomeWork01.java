public class HomeWork01{
    public static void main(String[] args){
        int a = jieCheng(5);
        System.out.println(a);
    }
    public static int jieCheng(int a){
        int s = 1;
        for(int i = a; i > 0; i--){
            s *= i;
        }
        return s ;
    }
}