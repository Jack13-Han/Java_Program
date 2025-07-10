package JKad22;



public class JKad22B {
    public static void main(String[] args) {
        System.out.println("引数の仕様 :");

        showBMI("ドラえもん",129.3,129.3);
        showBMI("ドラミちゃん",100.0,91.0);

    }

    public static void showBMI(String name,double height , double weight){

        double meter =height/100;
        double sum=(weight/meter)/meter;


        System.out.println(name+"のBMIは"+sum+"です。");


    }
}
