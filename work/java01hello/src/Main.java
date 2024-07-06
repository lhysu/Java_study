public class Main {
    public static void main(String[] args) {
        System.out.println("hello");    //string type
        System.out.println('a');        //char type
        System.out.println(111);        //int type(default)
        System.out.println(3.14);       //double type(default)
        System.out.println(true);       //boolean type
        //단축키:sout

        System.out.println("hello"+"kim");
        System.out.println(99+88);
        System.out.println("99"+"88");

        System.out.print("hello");
        System.out.print("hello\n");
        System.out.print("hello");
        System.out.println();
        System.out.print("kim");

        System.out.printf("hello\n");
        System.out.printf("he\tllo");           //  \t: tab
        System.out.printf("hello");
        System.out.println();
        //printf 단축키: souf

        int a = 10;
        double b = 99.99;
        System.out.println("a: "+a + " ,b: " + b);
        System.out.println("a: "+a);
        System.out.printf("a: %d ,b: %.2f\n",a,b);
        System.out.printf("a: %d\n",a);

        String name= "kim";
        System.out.println("name: " + name);
        System.out.printf("name: %s\n", name);

        System.out.printf("boolean: %b\n",true);
        System.out.printf("boolean: %B\n",true);        //대문자로 출력

        System.out.printf("name: %5s, age: %d\n","lee",33);          //꼭 변수에 넣지 않고 데이터가 와도 됌
        System.out.printf("name: %-5s, age: %d\n","lee",33);
        //%5s : 5칸중에 데이터 크기만큼 제외 왼쪽에 공백 생김      (여기에서는 "lee"가 3글자니까 2칸 공백)
        //%-5s : 5칸중에 데이터 크기만큼 제외 오른쪽에 공백 생김

        System.out.printf("10진수:%d,%d,%d,%d,%d,%d\n",10,11,12,13,14,15);
        System.out.printf("16진수:%x,%x,%x,%x,%x,%x\n",10,11,12,13,14,15);
        System.out.printf("8진수:%on,%on,%on,%on,%on,%on\n",10,11,12,13,14,15);
        //java에서는 이진수 printf 출력 기능 없음
        //이진수 변환 함수 사용
        System.out.println(Integer.toBinaryString(10));     //1010
        System.out.println(Integer.toHexString(10));        //a
        System.out.println(Integer.toOctalString(10));      //12




    }       //end main
}           //end class

//run 단축기: Shift + f10