// 任何一个方法体当中的代码都是遵循自上而下的顺序依次执行的。
/*
    推测执行结果：
        main begin
        m1 begin
        m2 begin
        m3 begin
        -------------
        m3 over
        m2 over
        m1 over
        main over
 */
public class MethodTest05{
    public static void main(String[] args){
        System.out.println("main begin");
        m1();
        System.out.println("main over");
    }
    public static void m1(){
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }
    public static void m2(){
        System.out.println("m2 begin");
        T.m3();
        System.out.println("m2 over");
    }
}
class T{
    public static void m3(){
        System.out.println("m3 begin");
        System.out.println("-------------");
        System.out.println("m3 over");
    }
}