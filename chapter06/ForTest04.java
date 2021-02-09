/*
    1、所有合法的"控制语句"都可以嵌套使用。
    2、for循环嵌套
        for(){
            for(){

            }
        }
        分析外层for循环的时候，把里面的for当做一段普通的java语句/代码
 */
public class ForTest04{
    public static void main(String[] args){
        for(int k = 0;k < 2;k++){ //循环2次
            for(int i = 0;i < 10;i++){
                System.out.println("i= "+i);
            }
        }
    }
}