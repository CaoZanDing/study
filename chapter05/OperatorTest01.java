/*
    算术运算符：
    +   求和
    -   相减
    *   乘积
    /   商
    %   求余数（求模）
    ++  自加1
    --  自减1
 */
public class OperatorTest01{
    public static void main(String[] args){
        int a = 10;
        int b = 3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a%b);
        System.out.println(a*b);
        System.out.println(a/b);

        //重点掌握  ++和--
        //这里重点讲解    ++，--可以照葫芦画瓢
        //  ++  自加1 （++可以出现在变量前也可以出现在变量后）
        int i = 10;
        i++;
        System.out.println(i);//11
        int k = 10;
        ++k;
        System.out.println(k);//11

        //研究： ++出现在变量前和变量后有什么区别？
        //语法：当 ++ 出现在变量后，会先做赋值运算，再自加1
        int m = 20;
        int n = m++;
        System.out.println(m);//21
        System.out.println(n);//20
        //语法：当 ++ 出现在变量前，会先自加1，再做赋值运算
        int x = 100;
        int y = ++x;
        System.out.println(x);//101
        System.out.println(y);//101

        //题目
        int c = 90;
        System.out.println(c++);// 传，这个“传”在这里有一个隐形的赋值运算。90
        //把上面代码拆解开
        //int temp1 = c++;
        //System.out.println(temp1);

        System.out.println(c);//91

        int d = 80;
        System.out.println(++d);
        //拆解
        //int temp2 = ++d;
        //System.out.println(temp2);

        System.out.println(d);

        int q = 50;
        int z = 70;
        System.out.println(q--);//50
        System.out.println(q);//49
        System.out.println(--z);//69
        System.out.println(z);//69
    }
}