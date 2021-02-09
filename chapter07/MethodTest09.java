public class MethodTest09{
    public static void main(String[] args){
        int jieGuo = sum(10 , 20);
        System.out.println(jieGuo);
        // 上面两行代码可以合并
        System.out.println(sum(10 , 20));

        boolean flag = m();
        if(flag){
            System.out.println("真的...");
        }
        // 同样，上面代码也可以合并
        if(m()){
            System.out.println("真的...");
        }

    }
    public static boolean m(){
        return true;
    }

    //求和的方法
    public static int sum(int a , int b){
        return a + b;
    }
}