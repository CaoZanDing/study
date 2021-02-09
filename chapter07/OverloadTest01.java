/*
    方法重载机制？
    使用方法重载机制的优点：
        优点1：代码整齐美观
        优点2："功能相似"的，可以让"方法名"相同，更易于以后的代码编写。

    在java语言中，是怎么进行方法区分的呢？
        首先java编译器会通过方法名进行区分。
        但是在java语言中允许方法名相同的情况出现。
        如果方法名相同的情况下，编译器会通过方法的参数类型进行方法的区分。
 */
public class OverloadTest01{
    public static void main(String[] args){
        System.out.println(sumInt(10 , 20));
        System.out.println(sumLong(10L , 20L));
        System.out.println(sumDouble(10.0 , 20.0));

        System.out.println("-----------------------------");

        System.out.println(sum(10 , 20));
        System.out.println(sum(10L , 20L));
        System.out.println(sum(10.0 , 20.0));
    }

    // 定义一个计算int类型数据的求和方法
    public static int sumInt(int a, int b){
        return a + b;
    }
    //定义一个计算long类型数据的求和方法
    public static long sumLong(long a , long b){
        return a + b;
    }
    //定义一个计算double类型数据的求和方法
    public static double sumDouble(double a, double b){
        return a + b;
    }

    //使用方法重载机制
    public static int sum(int a , int b){
        return a + b;
    }
    public static long sum(long a , long b){
        return a + b;
    }
    public static double sum(double a , double b){
        return a + b;
    }

}