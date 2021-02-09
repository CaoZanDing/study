/*
    题目：
        1、系统接收一个学生的考试等级，根据考试成绩输出成绩的等级。
        2、等级：
                优：[90-100]
                良：[80-90）
                中：[70-80）
                及格;[60-70）
                不及格：[0-60）
        3、要求成绩是一个合法的数字，成绩必须在[0-100]之间，成绩可能带有小数。
 */
public class IfTest03{
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        String str = "优";
        System.out.print("请输入成绩：");
        double grade = s.nextDouble();
        if (grade<0 || grade>100){
            System.out.println("成绩不合法");
        }else{
            if (grade<60){
                str = "不及格";
            }else if (grade<70){
                str = "及格";
            }else if (grade<80){
                str = "中";
            }else if (grade<90){
                str = "良";
            }
            System.out.println("您的成绩等级为："+ str);
        }
    }
}