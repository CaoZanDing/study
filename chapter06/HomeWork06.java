/*
    小芳的妈妈每天给她2.5元，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，
    她都会花去6元钱，请问，经过多少天，小芳才可以存到100元？

   注意：钱数带有小数，要用double类型

   主要练习：while循环 + 计数
 */
public class HomeWork06{
    public static void main(String[] args){
        double s = 0;
        int i = 0;
        while(s < 100){
            s += 2.5;
            i += 1;
            if(i % 5 == 0){
                s -= 6;
            }
        }
        System.out.println("经过"+i+"天小芳存到"+s+"元");
    }
}