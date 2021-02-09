/*
    条件运算符：（三目运算符）
        语法格式：
            布尔表达式 ？ 表达式1  ： 表达式2
        执行原理：
            布尔表达式的结果为true时，表达式1的执行结果作为整个表达式的结果。
            布尔表达式的结果为false时，表达式2的执行结果作为整个表达式的结果。
 */
public class OperatorTest05{
    public static void main(String[] args){
        boolean sex = false;
                //sex ? '男' ：'女'
                //错误：不是语句
        char c = sex ? '男' : '女';
        System.out.println(c);
        //实际开发中并不会这样

        //char x = sex ? '男' : "女"
        //错误：不兼容的类型，条件表达式中的类型错误
        System.out.println(sex ? '男' : "女");
        //这样可以，因为println后()可存放任意数据类型
    }
}