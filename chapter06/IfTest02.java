/*
    业务要求：
        1、从键盘上接收一个人的年龄。
        2、年龄要求为[0-150],其他值表示非法，需要提示非法信息。
        3、根据人的年龄来动态的判断这个人属于生命的哪个阶段？
            [0-5]  婴幼儿
            [6-10]  少儿
            [11-18]  少年
            [19-35]  青年
            [36-55]  中年
            [56-150]  老年
        4、请使用if语句完成以上的业务逻辑。
 */
public class IfTest02{
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        String str = "老年";
        System.out.print("请输入年龄： ");
        int i = s.nextInt();
        if(i<0 || i>150) {
            System.out.println("年龄非法");
        }else{
            if (i<=5){
                str = "婴幼儿";
            }else if (i<=10){
                str = "少儿";
            }else if (i<=18){
                str = "少年";
            }else if (i<=35){
                str = "青年";
            }else if (i<=55){
                str = "中年";
            }
            System.out.println("您的生命阶段为："+ str);
        }
        // if(i>=0 && i<=5){}  这样写代码比较啰嗦。

        //进一步改良,先令 str = "老年";

        //如果不使用嵌套if语句，可以在年龄非法时终止程序
        //return
    }
}