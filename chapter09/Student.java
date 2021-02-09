/*
    学生类
        学号：int
        姓名：String
        年龄：int
        性别：boolean
        住址：String

        变量必须先声明，再赋值才能访问。

        注意：对于成员变量来说，没有手动赋值时，系统默认赋值。
            赋的值都是默认值。

            类型              默认值
            -----------------------
            byte              0
            short             0
            int               0
            long              0L
            float             0.0F
            double            0.0
            boolean           false
            char              \u0000
            引用数据类型          null

            null是一个java关键字，全部小写，表示空。是引用数据类型的默认值。
 */
public class Student{
    //属性(描述状态)，在java程序中以"成员变量"的形式存在。

    // 学号
    int no;  // 这种成员变量又被称为实例变量

    // 姓名
    String name;

    // 年龄
    int age;

    // 性别
    boolean sex;

    // 住址
    String addr;
}