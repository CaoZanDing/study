public class VarTest04{
    int i = 10000;
    public static void main(String[] args){
        int i = 100;//这个i的有效范围是main方法
        System.out.println(i);
    }
    public static void x(){
        //在这个位置上能访问i吗？
        //错误：找不到符号
        //System.out.println(i);//i 无法访问

        //可以定义一个变量起名i吗？
        //这个i的有效范围是x方法
        int i = 200;//所以这个i和main方法中的i不再同一个域当中，不冲突。
        System.out.println(i);
    }
}