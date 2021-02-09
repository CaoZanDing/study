/*
    对象的创建和使用
 */
public class StudentTest{
    public static void main(String[] args){
        
        
        
        // i 属于局部变量吗？当然是。
        // 局部变量存储在栈内存当中。(栈主要存储局部变量。)
        int i = 100;

        // 创建学生对象1
        // s1属于局部变量吗？当然是。
        Student s1 = new Student();

        // 创建学生对象2
        // s2也是局部变量。
        Student s2 = new Student();
    }
}