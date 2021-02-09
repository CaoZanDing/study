/*
    在方法调用的时候，什么时候"类名."是可以省略的。什么时候不能省略？
    a（）方法调用b（）方法的时候，a和b方法都在同一个类中，"类名."可以省略。
    如果a（），b（）方法不在同一个类中，"类名."不能省略。
 */

// 类1
public class MethodTest04{
    public static void main(String[] args){
        MethodTest04.daYin();  // 调用daYin方法
        MethodTest04.daYin2(); // 调用daYin2方法
        //以上"MethodTest04."可以省略

        //跨类调用
        Class02.daYin();
        Class02.daYin2();
        //以上"Myclass."不能省略
    }
    public static void daYin(){
        System.out.println("Hello world!");
    }
    public static void daYin2(){
        System.out.println("Hello world2!!");
    }
}
// 类2
class Class02{
    public static void daYin(){
        System.out.println("Hello world!");
    }
    public static void daYin2(){
        System.out.println("Hello world2!!");
    }
}