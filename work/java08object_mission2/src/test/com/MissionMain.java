package test.com;

public class MissionMain
{
    public static void main(String[] args) {
        System.out.println("hello");


        Member[] mbs = new Member[5];

        for (int i = 0; i < 5; i++) {
            mbs[i] = new Member();
            System.out.printf("%d, %s, %s, %s, %s\n",
                    mbs[i].num,mbs[i].id,mbs[i].pw,mbs[i].name,mbs[i].tel);
        }

        System.out.println("=====================");

        for (int i = 0; i < 5; i++) {
            mbs[i] = new Member(i+1, "lee", "guest", "bye1234", "011");
            System.out.printf("%d, %s, %s, %s, %s\n",
                    mbs[i].num,mbs[i].id,mbs[i].pw,mbs[i].name,mbs[i].tel);
        }



    }//end main
}//end class
