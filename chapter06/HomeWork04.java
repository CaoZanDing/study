/*
    从控制台接收一个正整数，判断该数字是否为质数
    质数：质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数。

    ***重点：
        主要练习，在外部打布尔标记
 */
public class HomeWork04{
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = s.nextInt();
        boolean zhiShu = true;
        for(int i = 2;i < n;i++){
            if(n % i == 0){
                zhiShu = false;
                break;
            }
        }
        System.out.println("该数"+n+(zhiShu ? "是质数" : "不是质数"));
    }
}