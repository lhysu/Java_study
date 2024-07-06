//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main03 {
    public static void main(String[] args) {
        System.out.println("hello");
        //배열생성법
        //1.new type[]{datas,,,,};
        //2.new type[배열의 길이];       --> 데이터의 기본값이 할당됨

        int[] arr = new int[5]; //0,0,0,0,0
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //arr:1,2,3,4,5 반복문으로 할당
        for(int i = 0; i< arr.length;i++){
            arr[i] = i+1;
        }

        for(int x:arr){
            System.out.println(x);
        }

        double[] ds = new double[5];    //0.0, 0.0, 0.0, 0.0, 0.0
        for (int i=0;i<ds.length;i++){
            System.out.println(ds[i]);
        }

        //ds: 10.0, 20.0 ,30.0,40.0,50.0
        for(int i=0; i < ds.length; i++){
            ds[i] = (i+1) * 10;
        }

        for (double  x: ds){
            System.out.println(x);
        }

        boolean[] bs= new boolean[5];   //false,false,...
        for (int i=0;i<bs.length;i++){
            System.out.println(bs[i]);
        }

        //짝수 인덱스는 true, 홀수 인덱스는 false 할당하기
        for(int i = 0; i<bs.length;i++){
            if(i%2==0){
                bs[i] = true;
            }
        }

        for (boolean x: bs){
            System.out.println(x);
        }

        String[] strs = new String[5];  //null,nul,...
        for (int i=0;i<strs.length;i++){
            System.out.println(strs[i]);
        }

        //kim1,kim2,kim3....
        for(int i = 0; i< strs.length;i++){
            strs[i] = "kim"+(i+1);
        }

        for(String x: strs){
            System.out.println(x);
        }
    }//end main



}//end class