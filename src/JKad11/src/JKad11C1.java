public class JKad11C1 {
    public static void main(String[] args) {
        double d=0.0;
        float f = 0.0f;

        System.out.println("*** double 型に0.1 ずつ加算していきます！ ***");

        for (int i=0;i<10;i++){
            d+=0.1;
            System.out.println(d);
        }

        System.out.println();

        for (int i=0; i<10;i++){
            f+=0.1;
            System.out.println(f);
        }

    }
}
