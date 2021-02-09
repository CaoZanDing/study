//使用递归，请编写程序，计算1~n1的和
public class RecursionTest03{
    public static void main(String[] args){
        int k = sum(8);
        System.out.println(k);
    }

    //单独编写一个计算1~n的和的方法
    //这个代码修改为递归的方式
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
}