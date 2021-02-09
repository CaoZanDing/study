/*
    结论：byte，short，char做混合运算的时候，各自先转换成int再做运算。
 */
public class IntTest06{
    public static void main(String[] args){
        char c1 = 'a';
        byte b = 1;
        System.out.println(c1+b);//98

        //short s = c1+b;
        //错误：不兼容的类型：从int转换到short可能会有损失
        //编译器不知道这个加法最后的结果是多少，只知道是int类型。

        //short s = （short）c1+b;
        //错误：不兼容的类型：从int转换到short可能会有损失
        short s = (short)(c1+b);
        System.out.println(s);

        int a = 1;
        //short x = a;
        //不可以，编译器只知道a是int类型，不知道a中存储的是哪个值。
        //错误：不兼容的类型，从int转换到short可能会有损失
    }
}