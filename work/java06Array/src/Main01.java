//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");

        //배열-여러개의 데이터를 하나의 타입으로 정의할 수 있다.
        int a = 11;
        int b = 22;
        int c = 33;

        //1.선언과 데이터 초기화 동시에
        int[] arr = new int[]{11,22,33};            //int[]가 앞에 있는 경우 new int[]는 생략 가능
        //arr = {11,22,33};   //error


        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("arr.length:"+arr.length);

        //default for
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //forEach
        for(int item : arr){
            System.out.println(item);
        }
        //int [][] arr = new~로 선언되었다면
        //for(int[] item : arr){}

        //test({11,22,33})      //error
        test(new int[]{11,22,33});          //매개변수로 배열 사용 시

    }//end main

    //메소드는 전역에 만들어야 함
    static void test(int[] arr){
        System.out.println("test()...");
    }

}//end class