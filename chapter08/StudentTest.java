/*
    对象的创建和使用。
 */
public class StudentTest{
    public static void main(String[] args){

        //在这里可以访问Student类吗？
        //当然可以
        /*
            创建对象的语法是什么？
                目前死记硬背
                new 类名();
            类是模板，通过一个类，是可以创建n 多个对象的。
            new 是一个运算符。专门负责对象的创建。

            Student s1 = new Student();
            和
            int i = 10;
            解释一下：
                i 是变量名
                int 是变量的诗句类型
                100 是具体的数据

                s1 是变量名
                Student 是变量s1的数据类型(引用数据类型)
                new Student(); 这是一个对象。(学生类创建出来的学生对象)

                数据类型包括两种：
                    基本数据类型：byte, short, int , long ,float , double ,boolean , char
                    引用数据类型：String , Student......

              java中所有的"类"都属于引用数据类型
         */
        Student s1 = new Student();  // 和int i = 10;一个道理

        // 再通过该类创建一个全新的对象
        Student s2 = new Student();

        // 再创建一个？
        Student s3 = new Student();

        //
    }
}