//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");
        //문자열 배열
        String[] names = new String[]{"kim","lee","han"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        //System.out.println(names[3]);     //error(index 범위 초과)
        System.out.println("names.length:"+names.length);

        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i]);
        }

        for(String x : names){
            System.out.println(x);
        }
        System.out.println("--------------");

        //1.1,2.2,3.3을 데이터로 하는 배열을 만들고 출력하세요
        double[] d = new double[]{1.1,2.2,3.3};
        for (int i = 0; i <d.length ; i++) {
            System.out.println(d[i]);
        }

        for(double x : d){
            System.out.println(x);
        }

        //a,b,c를 데이터로 하는 배열을 만들고 출력하세요
        char[] c = new char[]{'a','b','c'};
        for (int i = 0; i <c.length ; i++) {
            System.out.println(c[i]);
        }

        for(char x : c){
            System.out.println(x);
        }

        //true, false, true를 데이터로 하는 배열을 만드록 출력하세요
        boolean[] b = new boolean[]{true,false,true};
        for (int i = 0; i <b.length ; i++) {
            System.out.println(b[i]);
        }

        for(boolean x : b){
            System.out.println(x);
        }


    }//end main



}//end class