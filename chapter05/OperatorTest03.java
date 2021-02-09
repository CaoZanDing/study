/*
    逻辑运算符：
        &   逻辑与（可以翻译成并且）
        |   逻辑或（可以翻译成或者）
        ！  逻辑非（取反）
        &&  短路与
        ||  短路或

        true & true =true
        非常重要：
            逻辑运算符两边要求都是布尔类型，并且最终的运算结果也是布尔类型。
            100 & true 不行，语法错误
            true & false 可以。
 */
public class OperatorTest03{
    public static void main(String[] args){
        //对于逻辑与&运算符来说，只要有一边是false，结果就是false
        //只有两边同时为true，结果才是true
        System.out.println(true & true);//true
        System.out.println(true & false);//false
        System.out.println(false & false);//false
        System.out.println(100>90 & 100>101);//false
        System.out.println((100>90) & (100>101));//false

        //对于逻辑或|
        //只要有一边是true，结果就是true。
        int a = 100;
        int b = 101;
        int c = 90;
        System.out.println(a<b | c>b);//true
        System.out.println(true | false);//true
        System.out.println(false | false);//false

        //对于逻辑非！
        System.out.println(!(a>b));//true

/*
    关于短路与 &&,短路或 ||
    研究短路与&&，短路或||照葫芦画瓢

    短路与&& 和逻辑与&有什么区别？
        这两个运算符的运算结果没有任何区别，完全相同。
        只不过“短路与&&”会发生短路现象。

    什么是短路现象呢？
        右边表达式不执行，这种现象叫做短路现象。
    什么时候使用&&，什么时候使用&  ？
        从效率方面来说，短路与&& 比逻辑与& 效率更高。
        因为逻辑与& 不管第一个表达式结果是什么，第二个表达式一定会执行。

        以后的开发中，短路与&& 和逻辑与& 还是需要同时并存的.
        大部分情况下都建议使用短路与&&
        只有当既需要左边表达式执行，又需要右边表达式执行的时候，才会选择逻辑与&。
*/
        int x = 10;
        int y = 11;
        System.out.println(x>y & x>y++);// x>y++ 这个表达式执行了
        System.out.println(y);//12
        System.out.println(x>y && x>y++);
        //因为左边的表达式已经确定是false了，整个表达式的结果已经确定是false了，右边的x>y++表达式不执行（短路）
        System.out.println(y);//12

        System.out.println(x<y | x>y++);
        System.out.println(y);//13
        System.out.println(x<y || x>y++);
        //因为左边的表达式已经确定是true了，整个表达式的结果已经确定是true了，右边的x>y++表达式不执行（短路）
        System.out.println(y);//13
    }
}