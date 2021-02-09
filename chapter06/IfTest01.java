/*
    if语句的语法结构以及运行原理？
        if语句是分支语句，也可以叫做条件语句
        if语句的语法格式：
            第一种写法：
                if（布尔表达式）{
                    java语句;
                    java语句;
                }
                这里的一个大括号{}叫做一个分支。
                该语法的执行原理：
                    如果布尔表达式的结果是true，则执行大括号中的程序，否则不执行大括号中的代码。
            第二种写法：
                if（布尔表达式）{  //分支1
                    java语句;
                }else{              //分支2
                    java语句;
                }
                该语法的执行原理：
                    如果布尔表达式的结果是true，则执行分支1,不执行分支2
                    如果布尔表达式的结果是false，则执行分支2，不执行分支1
                以上的这个语句可以保证一定会有一个分支执行。
            第三种写法：
                if（布尔表达式1）{     //分支1
                    java语句;
                }else if（布尔表达式2）{   //分支2
                    java语句;
                }else if（布尔表达式3）{       //分支3
                    java语句;
                }else if（布尔表达式4）{           //分支4
                    java语句;
                }.....
                该语法的执行原理：
                    先判断"布尔表达式1"，如果"布尔表达式1"结果为true，则执行分支1，然后if语句结束。
                    当"布尔表达式1"执行结果是false，那么会继续判断布尔表达式2的结果，
                    如果布尔表达式2的结果是true，那么执行分支2，然后整个if语句结束。

                    从上往下一次判断，主要看第一个true发生在哪个分支上。
                    第一个true对应的分支执行，只要一个分支执行，整个if结束。
              第四种写法：
                    if（布尔表达式1）{     //分支1
                    java语句;
                }else if（布尔表达式2）{   //分支2
                    java语句;
                }else if（布尔表达式3）{       //分支3
                    java语句;
                }else if（布尔表达式4）{           //分支4
                    java语句;
                }else{
                    java语句;             //以上条件没有一个成立的，这个else就执行了。
                }


        注意：

            1、对于if语句来说，在任何情况下只能有1个分支执行，不可能存在2个或多个分支执行。
                if语句中只要有1个分支执行了，整个if语句就结束了。
            2、以上4种语法机制中，凡是带有else分支的，一定可以保证会有一个分支执行。
                以上4种当中，第一种和第三种没有else分支，这样的语句可能会导致一个分支都不执行。
                            第二种和第四种肯定会有1个分支执行。
            3、当分支中"java语句"只有1条，那么大括号{}可以省略，但为了可读性，最好不要省略。
            4、控制语句和控制语句之间是可以嵌套的，但是嵌套的时候最好一个语句一个语句进行分析，不要冗杂在一起分析。
                    （从外到里）
 */
public class IfTest01{
    public static void main(String[] args){
        boolean sex = true;
        //定义一个布尔类型的变量，表示性别。
        //业务：当sex为true时表示男，为false时表示女。
        /*
        if (sex == true){
            System.out.println("男");
        }else{
            System.out.println("女");
        }
         */
        //改良
        if (sex){
            System.out.println("男");
        }else{
            System.out.println("女");
        }
        //进一步改良，使用三目运算符。
        sex = false;
        System.out.println(sex ? "男" : "女");

        if(sex = true){ //不管之前sex是true还是false，到这里都是true。
            System.out.println("男");
        }else{
            System.out.println("女");
        //虽然这种语法可以，但是会导致else分支永远不能执行。
        }

        /*
        int i = 100;
        if(i = 100){    //（i = 100）整体执行完之后是一个int类型，不是boolean类型。
            System.out.println("i是100");
        }
        编译报错：不兼容的类型：int无法转换为boolean
         */
        //判断以下代码哪一行会出现问题？
        if (sex)
            System.out.println("男");
            System.out.println("HelloWorld");//以上的这3行代码没有问题，合乎语法。
        //else //这一行编译报错，因为else缺少if
            //System.out.println("女");
    }
}