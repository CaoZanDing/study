/*
    从键盘接收一个正整数，该正整数作为行数，输出以下图形
                *
               ***
              *****
             *******
            *********
    例如：输入5，则打印上图5行。

    空格的规律：
        第i行有（rows-i）个空格
    "*"的规律：
        第i行有（2*i-1）个"*"
 */
public class HomeWork05{
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入一个正整数作为行数：");
        int rows = s.nextInt();
        for(int i = 1;i <= rows;i++){  //外层循环控制的是总行数。
            //这里需要将一行全部输出
            //在这里需要再次使用循环，输出空格以及"*"
            for(int m = 1;m <= rows-i;m++){  //输出空格的循环
                System.out.print(" ");
            }
            for(int q = 1;q <= 2*i-1;q++){  //输出"*"的循环
                System.out.print("*");
            }
            System.out.println();
        }
    }
}