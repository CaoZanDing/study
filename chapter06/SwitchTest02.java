public class SwitchTest02{
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入学生成绩： ");
        double score = s.nextDouble();
        if (score<0 || score>100){
            System.out.println("成绩不合法！！！");
            return;
        }
        String str = "不及格";
        switch((int)(score/10.0)){
        case 10: case 9:
            str = "优";
            break;
        case 8:
            str = "良";
            break;
        case 7:
            str = "中";
            break;
        case 6:
            str = "及格";
            break;
        }
        System.out.println("该学生的成绩等级为："+str);
    }
}