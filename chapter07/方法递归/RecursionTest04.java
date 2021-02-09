/*
    计算n的阶乘
    1、使用方法递归的方式
    2、使用循环
 */
public class RecursionTest04{
    public static void main(String[] args){
        int k = jieCheng(6);
        System.out.println(k);
    }
/*
    public static int jieCheng(int n){
        if(n == 1){
            return 1;
        }
        return n * jieCheng(n - 1);
    }
 */
    public static int jieCheng(int n){
        int s = 1;
        for(int i = 1;i <= n;i++){
            s *= i;
        }
        return s ;
    }
}