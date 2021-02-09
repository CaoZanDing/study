/*
    continue;语句：
        1、continue翻译为：继续
        2、continue语句和break语句要对比着学习
        3、continue语句的作用是：
            终止当前"本次"循环，直接进入下一次循环继续执行
            for(){
                if(){ //当这个条件成立时，执行continue语句
                    continue;
                }
                //以上的continue一旦执行，一下代码不执行，直接执行更新表达式
                code1;
                code2;
                code3;
                code4;
            }
        4、continue语句后面也可以和break一样指定循环。

 */
public class ContinueTest01{
    public static void main(String[] args){
        for(int i = 0;i < 10;i++){
            if(i == 5){
                break;
            }
            System.out.println("i= "+i); //0 1 2 3 4
        }
        System.out.println("--------------------------");
        for(int i = 0;i < 10;i++){
            if(i == 5){
                continue;
            }
            System.out.println("i= "+i); //0 1 2 3 4 6 7 8 9
        }
    }
}