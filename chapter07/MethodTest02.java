/*
   方法定义在类体当中。
   方法定义的先后顺序没有关系，都可以。
 */
public class MethodTest02{

    /*
        public static void sumInt(int x, int y){
        int z = x + y;
        System.out.println(x + "+" + y + "=" + z);
    }
     */
    // 主方法。入口
    public static void main(String[] args){ //代码自上而下逐行执行。
        // 需求1：请编写程序，计算100和200的求和。
        sumInt(100,200);
        // 需求2：请编写程序，计算666和888的求和。
        sumInt(666,888);
        // 需求3：请编写程序，计算111和222的求和
        sumInt(111,222);
    }
    // 专门在这个类体当中定义一个方法，这个方法专门来完成求和。
    // x,y,z在以下的sumInt方法当中都属于局部变量
    //局部变量有一个特点：方法结束之后，局部变量占用的内存会自动释放
    public static void sumInt(int x, int y){
        int z = x + y;
        System.out.println(x + "+" + y + "=" + z);
    }
}

// 这里并没有讲解方法的定义，以及方法的调用。