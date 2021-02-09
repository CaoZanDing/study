/*
    使用for循环，实现1~100所有奇数求和
 */
public class ForTest03{
    public static void main(String[] args){
        int s = 0;//不能在循环体中声明，这样会导致"计算器归0"
        for(int i =1;i <= 100;i++){
            if(i % 2 == 1){
                s += i;
            }
        }
        System.out.println("1~100所有奇数的和是："+s);
    }
}
