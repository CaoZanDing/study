
/*
    题目：
        业务：
            从键盘上接收天气的信息：
                1表示：雨天
                0表示：晴天
            同时从键盘上接收性别的信息：
                1表示：男
                0表示：女
            业务要求：
                当天气是雨天的时候：
                    男的：打一把大黑伞
                    女的：打一把小花伞
                当天气是晴天的时候：
                    男的：直接走起，出去玩耍
                    女的：擦点防晒霜，出去玩耍

            需要使用if语句以及嵌套的方式展现这个业务。
 */
public class IfTest04{
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入天气：");
        int weather = s.nextInt();
        if (weather<0 || weather>1){
            System.out.println("输入不合法！！！");
        }else {
            System.out.print("请输入性别：");
            int sex = s.nextInt();
            if(weather == 1){
                if (sex<0 || sex>1){
                    System.out.println("输入不合法");
                }else if (sex == 1){
                    System.out.println("打一把大黑伞");
                }else{
                    System.out.println("打一把小花伞");
                }
            }else{
                if (sex<0 || sex>1){
                    System.out.println("输入不合法");
                }else if (sex == 1){
                    System.out.println("直接走起，出去玩耍");
                }else{
                    System.out.println("擦点防晒霜，出去玩耍");
                }
            }
        }
    }
}