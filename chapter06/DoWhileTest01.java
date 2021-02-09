/*
    do..while循环语句的执行原理以及语法机制：
        语法机制：
            do{
                循环体;
            }while（）;

            注意：do..while循环最后有一个 ;

        执行原理：
            先执行循环体当中的代码，执行一次循环体之后，
            判断布尔表达式的结果，如果为true，则继续执行
            循环体，如果为false循环结束。

        对于do..while来说，循环体至少执行1次。循环体的执行次数是：1~n次。
        而对于while循环来说，循环体执行次数是：0~n次。
 */
public class DoWhileTest01{
    public static void main(String[] args){
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i < 10);
        //下面代码执行结果与上面代码一样(0 1 2 3 ..... 9)
        i = 0;
        do{
            System.out.println(i++);
        }while(i < 10);

        i = 0;
        do{
            System.out.println(++i);// 1 2 3 ..... 10
        }while(i < 10);
    }
}