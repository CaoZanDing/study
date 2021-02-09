/*
    九九乘法表

    1*1=1
    1*2=2 2*2=4
    1*3=3 2*3=6 3*3=9
    1*4*4 2*4=8 3*4=12 4*4=16
    .....
    .....
    1*9=9 2*9=18 ................. 9*9=81

    第一个特点：共9行
    第二个特点：第1行1个，第2行2个 ......第n行n个
 */
public class ForTest05{
    public static void main(String[] args){
        //9行，需要循环9次
        for(int i = 1;i <= 9;i++){ //纵向循环
            for(int k = 1;k <= i;k++){ //i是行号，需要循环i次
                System.out.print(k +"*"+ i +"=" + k*i);//或加 +" "
                System.out.print('\t');
            }
            System.out.print('\n');//或println（）;
        }
    }
}