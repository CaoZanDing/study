/*
    计算 1+2-3+4-5+6-7......+100的结果
    找规律：奇数时减法，偶数时加法（除1之外）
 */
public class HomeWork02{
    public static void main(String[] args){
        int s = 1;
        for(int i = 2;i <= 100;i++){
            if(i % 2 ==0){
                s += i;
            }else{
               s -= i;
            }
        }
        System.out.println("1+2-3+4-5+6-7......+100的结果是："+s);
    }
}