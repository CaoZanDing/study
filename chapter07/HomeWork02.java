public class HomeWork02{
    public static void main(String[] args){
        daYuGaiShuDeZuiXiaoZhiShu(8);
        daYuGaiShuDeZuiXiaoZhiShu(10);
        daYuGaiShuDeZuiXiaoZhiShu(7);
    }
    public static void daYuGaiShuDeZuiXiaoZhiShu(int a){
        for(int i = a+1;true; i++){
            boolean zhiShu = true;
            for(int n = 2; n < i; n++){
                if(i % n == 0){
                    zhiShu = false;
                }
            }
            if(zhiShu == true){
                System.out.println(i);
                break;
            }
        }
    }
}