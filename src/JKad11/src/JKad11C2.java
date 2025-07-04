public class JKad11C2 {
    public static void main(String[] args) {
        long l =7;
        double d = 7;

        System.out.println("それぞれ16 倍して15 加算していきます！");
        for (int i=0; i<16;i++){
            l*=16;
            l+=15;

            d*=16;
            d+=15;

            System.out.println("--------");
            System.out.println("long 型:"+l);
            System.out.println("double 型:"+d);

        }
    }
}
