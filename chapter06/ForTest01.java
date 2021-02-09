/*
    1、for循环的语法机制以及运行原理？
        语法机制：
        for（初始化表达式;条件表达式;更新表达式）{
            循环体;//循环体由java语句构成
        }
        注意：
            第一：初始化表达式最先执行，并且在整个循环中只执行一次。
            第二：条件表达式结果必须是一个布尔类型，也就是：true或false
        执行原理:
            先执行初始化表达式，并且初始化表达式只执行1次。
            然后判断条件表达式的结果，如果条件表达式结果为true，则执行循环体。
            循环体结束之后，执行更新表达式。
            更新完之后，再判断条件表达式的结果，如果还是true，继续执行循环体。
            直到更新表达式执行结束之后，再次判断条件时，结果为false，佛如循环终止。

            更新表达式的作用是：控制循环的次数，换句话说，更新表达式会更新某个变量的值，这样条件表达式的结果
            才有可能从true变成false，从而终止for循环的执行，如果缺少更新表达式，很有可能会导致死循环。

 */
public class ForTest01{
    public static void main(String[] args){
        //最简练的for循环怎么写？
        /*
        for(;;){
            System.out.println("死循环"）;
        }
         */
        //最常见的for循环
        for(int i = 0;i<10;i++){
            System.out.println("i=" + i);
            /*
                强调：以上for循环，其中int i = 0; 最先执行，并且只执行一次，而且i变量属于for循环的局部变量，
                    for循环结束之后i的内存就释放了。
                    这个i变量只能在for循环中使用。
             */
        }
        int i = 0;
        for(;i<10;i++){
            System.out.println("i---->" + i);
        }
        System.out.println(i);//10

        //变形
        for(int k = 1;k <= 10;k++){
            System.out.println("k--->" + k);//1 2 3 ..... 10
        }
        //变形
        for(int k = 1;k <= 10;){
            System.out.println("k--->" + k);//1 2 3 ..... 10
            k++;
        }
        //变形
        for(int k = 1;k <= 10;){
            k++;
            System.out.println("k--->" + k);//2 3 4 ..... 11
        }
    }
}