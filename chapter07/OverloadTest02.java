/*
    方法重载（overload）：
        什么时候需要考虑使用方法重载？
            在同一个类当中，如果"功能1"和"功能2"，它们的功能是相似的，那么
            可以考虑将它们的方法名一致，这样代码既美观，又便于后期代码编写（容易记忆，方便使用）

        注意：方法重载overload不能随便使用，如果两个功能压根不相干，不相似，根本没关系，此时
            两个方法使用重载机制的话，会导致编码更麻烦，无法进行方法功能的区分。

        什么时候代码会发生方法重载？
            条件1：在同一个类当中
            条件2：方法名相同
            条件3：参数列表不同
                    参数的个数不同算不同
                    参数的类型不同算不同
                    参数的顺序不同算不同
            只要同时满足以上3个条件，那么我们可以认定方法和方法之间发生了重载机制

        注意：
            不管代码怎么写，最终一定能让java编译器很好的区分开这两个方法。
            方法重载和方法的"返回值类型"无关。
            方法重载和方法的"修饰符列表"无关。
*/
public class OverloadTest02{
    public static void main(String[] args){
        m1();
        m1(100);
        m2(100);
        m2(100.0);
        m3(10 , 20.0);
        m3(20.0 , 10);
    }

    public static void m1(){
        System.out.println("m1无参数的执行！");
    }
    public static void m1(int a){
        System.out.println("m1有一个int类型参数执行！");
    }

    public static void m2(int x){
        System.out.println("int类型");
    }
    public static void m2(double x){
        System.out.println("double类型");
    }

    public static void m3(int x , double y){
        System.out.println("先int类型再double类型");
    }
    public static void m3(double x , int y){
        System.out.println("先double类型再int类型");
    }

    //这不是方法重载，这是方法重复了
    /*
    public static int m4(){
        return 1;
    }
    public static double m4(){
        return 1.0;
    }
     */
}