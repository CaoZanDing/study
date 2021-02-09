/*
    1、输出信息到控制台：
        System.out.println(...);
    2、在java中怎么接收键盘的输入呢？
        以下代码在学习完面向对象章节之后才能够理解。

       前提： java.util.Scanner s = new java.util.Scanner(System.in);
        接收一个整数怎么办？
         int num = s.nextInt();
        接收一个字符串怎么办？
         String str = s.next();
 */
public class KeyInput{
    public static void main(String[] args){
        //创建一个键盘扫描器对象
        //s  变量名，可以修改，其他不能修改。
        java.util.Scanner s = new java.util.Scanner(System.in);//这行代码写一次就行

        //接收用户的输入，从键盘上接收一个int类型的数据
        //解释这行代码：代码执行到这里的时候，会暂停下来
        //等待用户的输入，用户可以从键盘上输入一个整数，然后回车，回车之后
        //i变量就有值了。并且i变量中保存的这个值是用户输入的数字。
        //i变量就是用来接收键盘数据的。
        int i = s.nextInt();
        System.out.println("您输入的数字是： "+i);

        //代码执行到此处又会停下来，等待用户的输入。
        //敲完回车，s.nextInt();代码执行结束
        //如果输入的不是数字，那么会出异常：InputMismatchException
        int j = s.nextInt();
        System.out.println("您输入的数字是： "+j);

        //怎么从键盘上接收一个字符串？
        //程序执行到此处会停下来，等待用户的输入，用户可以输入字符串。
        String str = s.next();
        System.out.println("您输入了： "+str);

        System.out.print("您的用户名是：");
        String name = s.next();
        System.out.println("欢迎"+name+"回来");
    }
}