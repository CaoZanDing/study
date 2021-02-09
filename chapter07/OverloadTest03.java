public class OverloadTest03{
    public static void main(String[] args){
        // println是一个方法名，这个方法是SUN公司的java团队写的。(写在源代码中）
        // 参数类型可以随便传。这说明println()方法重载了。
        System.out.println(100);
        System.out.println(3.14);
        System.out.println("abc");
        System.out.println('a');
        System.out.println(100L);
        System.out.println(3.14F);
    }
}