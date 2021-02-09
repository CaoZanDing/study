public class TypeTransferTest{
    public static void main(String[] args){
        //byte b1 = 1000;
        //编译报错，因为1000已经超出byte取值范围。
        byte b2 = 20;
        //可以
        short s = 1000;
        //可以
        int c = 1000;
        //可以
        long d = c;
        //可以
        //int e = d;
        //编译报错
        int f = 10/3;
        //可以
        long g = 10;
        //可以
        //int h = g/3;
        //编译报错
        long m = g/3;
        //可以
        //byte x = (byte)g/3;
        //编译报错
        short y = (short)(g/3);
        //可以
        short i = 10;
        //可以
        byte j = 5;
        //可以
        //short k = i+j;
        //编译报错
        int n = i+j;
        //可以
        char cc = 'a';
        System.out.println(cc);//a
        System.out.println((byte)cc);//97
        int o = cc+100;
        System.out.println(o);
    }
}