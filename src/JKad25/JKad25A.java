package JKad25;

public class JKad25A {
    public static void main(String[] args) {
        String str1 = new String("ECC Computer");
        String str2 = new String("ECC Computer");


        System.out.println("str1 は\""+str1+"\"です！");
        System.out.println("str2 は\""+str2+"\"です！");

        boolean equal=str1==str2;
        System.out.println("==（比較演算子）で比較しました！\t"+equal);


        System.out.println("eauqls メソッドで比較しました！\t"+strEquals(str1,str2));

        

        boolean condi=false;
        for (int i = 0; i <str1.length() ; i++) {
                char a=str1.charAt(i);
                char b= str2.charAt(i);
                if (a==b){
                    condi=true;
                }else {
                    condi=false;
                    break;
                }

        }
        System.out.println("一文字ずつがんばって比較しました！\t"+condi);
    }


    public static boolean strEquals(String str1, String str2){
        if (str1.equals(str2)){
            return true;
        }else {
            return false;
        }

    }
}
