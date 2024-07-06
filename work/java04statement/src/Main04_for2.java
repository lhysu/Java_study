public class Main04_for2 {
    public static void main(String[] args) {
        System.out.println("hello");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        first:for (int k = 0; k< 3;k++){
            second:for(int i = 0 ; i < 3; i++){
                for(int j = 0 ; j<10; j++){
                    System.out.print(j+" ");
                    if(j==5) break second;                      //반복문에 라벨 만들기 가능
                }
                System.out.println();
            }
        }


        for( int i = 2; i < 10; i++){
            for( int j = 1 ; j < 10 ; j++){
                System.out.printf("%d*%d=%2d ",i,j,i*j);
            }
            System.out.println();
        }



    }//end main

}//end class
