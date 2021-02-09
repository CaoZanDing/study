/*
    从控制台输入一个正整数，计算该数的阶乘。例如输入5，阶乘为 5*4*3*2*1
 */
public class HomeWork03{
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = s.nextInt();
        int m = 1;
        for(int i = n;i > 0;i--){
            m *= i;
        }
        System.out.println("该数的阶乘为："+m);
    }
}
