/*
    一个数如果恰好等于它的因子之和，这个数就是完数，例如 6=1+2=3
    找出1000以内所有的完数
 */
public class HomeWork07{
    public static void main(String[] args){
       int i = 1;
       while(i <= 1000){
           int m = 0;
           for(int n =1;n <= i/2;n++){
               if(i % n ==0){
                   m += n;
               }
           }
           //以上for结束表示:所有因子求和完毕了。
           if(i == m){
               System.out.println("1000以内的完数有："+i);
           }
           i++;
       }
    }
}