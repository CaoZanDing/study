public class MethodTest07{
    public static void main(String[] args){
        //调用方法
        int a = m2();
        System.out.println(a);

        //调用x方法
        int b = x(true);
        System.out.println(b);
        //再次调用x方法
        int c = x(false);
        System.out.println(c);
    }
    /*
    public static int m(){
        boolean flag = true; //编译器不负责运行程序，编译器只讲道理
        if(flag){       // 对于编译器来说，编译器只知道flag变量是boolean类型
                        // 编译器会认为flag有可能是false，有可能是true
            return 1 ;  // 编译器觉得这行代码可能会执行，当然也可能不会执行
                        //编译器为了确保程序不出现任何异常，所以编译器报错：缺少返回语句
        }
    }
    错误：缺少返回语句
     */
    // 怎么修改这个程序？
    //第一种方案
    /*
    public static int m(){
        booelan flag = true;
        if(flag){
            return 1 ;
        }else{
            return 0 ;
        }
    }
     */
    //第二种方案
    //return语句一执行，整个方法结束
    /*
    public static int m(){
        booelan flag = true;
        if(flag){
            return 1 ;
        }
            return 0 ;
    }
     */

    //在同一个域当中，"return语句"下面不能再编写其它代码。编写之后编译报错。
    public static int m() {
        boolean flag = true;
        if (flag) {
            return 1;
            //System.out.println("Hello1");
            //错误：无法访问的语句
        }
        System.out.println("Hello1");  //这行代码与"return 1 ;"不在同一个域当中
        return 0;
        //System.out.println("Hello1");
        //错误：无法访问的语句
    }
    //三目运算符有的时候会让代码很简练
    public static int m2(){
        boolean flag = true;
        return flag ? 1 : 0 ;
    }

    public static int x(boolean flag){
        return flag ? 1 : 0;
    }
}