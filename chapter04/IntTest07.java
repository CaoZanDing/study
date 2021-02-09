/*
    结论：多种数据类型做混合运算的时候，最总的结果类型是"最大容量"对应的类型
    char+short+byte这个除外。
    因为char+short+byte混合运算的时候，会各自先转换成int再做运算。
 */
public class IntTest07{
    public static void main(String[] args){
        long a = 10L;
        char c = 'a';
        short i = 100;
        int s = 30;
        System.out.println(a+c+i+s);//237

        //int x = a+c+i+s;
        //错误：不兼容的类型：从long转换到int可能会有损失
        //计算结果是long类型
        int x = (int)(a+c+i+s);
        System.out.println(x);

        int temp = 10/3;
        System.out.println(temp);
        //结果最终取整
        //java中规定，int类型和int类型最终的结果还是int类型。
        //在java中计算结果不一定是精确的。
        int temp2 = 1/2;
        System.out.println(temp2);
        int temp3 = 2/3;
        System.out.println(temp3);
    }
}