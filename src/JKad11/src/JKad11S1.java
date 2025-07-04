

public class JKad11S1 {
    public static void main(String[] args) {
        System.out.print("取得した乱数\t");
        double n = Math.random();

        int n1=(int) (n+1);
        double n2 = ((int) (n*10 +0.5))/10.0;
        double n3 = ((int) (n*100 +0.5))/100.0;
        System.out.println(n);
        System.out.println("小数第1 位で四捨五入\t"+n1);
        System.out.println("小数第2 位で四捨五入\t"+n2);
        System.out.println("小数第3 位で四捨五入\t"+n3);


    }
}
