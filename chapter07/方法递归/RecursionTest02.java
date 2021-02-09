//先不使用递归，编写程序，计算1~n的和。
public class RecursionTest02{
    public static void main(String[] args){
        int k = sum(8);
        System.out.println(k);
    }

    //单独编写一个计算1~n的和的方法
    public static int sum(int n){
        int s = 0;
        for(int i = 1;i <= n;i++){
            s += i;
        }
        return s;
    }
}