//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main04 {
    public static void main(String[] args) {
        System.out.println("hello");

        //다차원 배열-multi array
        //1.데이터 직접 할당(동적 할당)
        int[][] suss = new int[][]{new int[]{11,22,33},new int[]{44,55,66,77}};
        //int[][] suss = new int[][]{{11,22,33},{44,55,66}};            //이렇게 사용해도 됌

        for(int j=0; j < suss.length;j++){
            for (int i = 0; i < suss[j].length; i++) {
                System.out.print(suss[j][i]+" ");
            }

            System.out.println();
        }
        System.out.println("==================");

        //2.데이터 길이를 정해서 지정된 값(기본값)으로 할당(정적할당)
        int[][] arrs = new int[2][];        //new연산자: 메모리에 주소가 생김(null이 아니게 함)
                //arrs[0] = null, arrs[1] = null인 상태
        arrs[0] = new int[5];       //default 값(0)으로 채워짐
        arrs[1]= new int[]{1,1,1,1,1,1,1};
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j<arrs[i].length  ; j++) {
                System.out.print(arrs[i][j]+" ");
            }
            System.out.println();
        }

        int[][] arrs2 = new int[2][4];
        for(int i = 0; i <arrs2.length;i++){
            System.out.println(arrs2[i]);       //주소 출력
        }
        for (int i = 0; i < arrs2.length; i++) {
            for (int j = 0; j<arrs2[i].length  ; j++) {
                System.out.print(arrs2[i][j]+" ");
            }
            System.out.println();
        }

        //문자열 2차원 배열을 만들고 출력해보세요(정적 배열과 동적 배열 각각 생성)
        String[][]  strs=new String[][]{{"kim1","lee1","han1"},{"kim2","lee2","han2","choi2"}};
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length; j++) {
                System.out.print(strs[i][j]+" ");
            }
            System.out.println();
        }//동적할당

        String[][] strs2 = new String[2][3];
        //0 : {"kim","lee","han"}
        //1 : {"yang","choi","park"}
        strs2[0] =new String[]{"kim","lee","han"};
        strs2[1] =new String[]{"yang","choi","park"};

        strs2[0][0]="aaa";
        strs2[0][1]="bbb";
        strs2[0][2]="ccc";


        for (int i = 0; i < strs2.length; i++) {
            for (int j = 0; j < strs2[i].length; j++) {
                System.out.print(strs2[i][j]+" ");
            }
            System.out.println();
        }//정적할당


        System.out.println("==================");
        //strs2 forEach로 출력
        for(String[] x : strs2){
            for(String y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }

        System.out.println("==================");


        //실수 2차원 배열을 만들고 출력해보세요
        double[][] dss = new double[][]{{1.0,2.0},{3.0,4.0,5.0}};
        for (int i = 0; i < dss.length; i++) {
            for (int j = 0; j < dss[i].length; j++) {
                System.out.print(dss[i][j]+" ");
            }
            System.out.println();
        }//동적할당

        double[][] ds2 = new double[2][3];
        for (int i = 0; i < ds2.length; i++) {
            for (int j = 0; j < ds2[i].length; j++) {
                System.out.print(ds2[i][j]+" ");
            }
            System.out.println();
        }//정적할당

        System.out.println("==================");
        //ds2 forEach로 출력
        for(double[] x : dss){
            for(double y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }

        System.out.println("==================");

    }//end main



}//end class