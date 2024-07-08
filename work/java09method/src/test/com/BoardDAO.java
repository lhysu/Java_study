package test.com;

public class BoardDAO {
    //데이터베이스와 연동해서 CRUD(입력, 수정, 삭제, 검색) 처리기능용..

    //메소드 - 리턴 타입을 반드시 명시, 리턴 값이 없다면 void 명시
    //        리턴 값이 있다면 해당 리터럴의 타입을 명시해줘야 함


    //1.입력-insert,create        인자X, 리턴X
    void insert(){
        System.out.println("insert()...");
        //return;       //리턴할 값(리터럴)이 없다면 생략 가능 / 호출 위치로 돌아감
    }

    //2.수정-update...        인자O, 리턴X
    //메소드 인자(argument)는 0개 이상
    //같은 이름의 메소드 사용시는 오버로딩 규칙(순서, 타입, 개수)을 지켜주면 사용가능하다.
    //오버로딩 - 클래스 내부에 동일한 생성자, 메소드의 이름을 사용하기 위한 규칙 (리턴은 상관없고 인자가 중요)

    void update(int x){
        System.out.println("update()...x: "+x);

    }
    void update(int x, int y){
        System.out.println("update()...x: "+x+",y:"+y);

    }
    void update(int x,String y){
        System.out.println("update()...x: "+x+",y:"+y);

    }
    void update(String x, int y){
        System.out.println("update()...x: "+x+",y:"+y);

    }

    void update(int num,
                String title,
                String content,
                String writer,
                String wdate){
        System.out.println("update(AllArgs)...");
        System.out.println(num);
        System.out.println(title);
        System.out.println(content);
        System.out.println(writer);
        System.out.println(wdate);
    }

    void update(BoardVO vo){
        System.out.println("update()...vo: "+vo);
        /*System.out.println(vo.num);
        System.out.println(vo.title);
        System.out.println(vo.content);
        System.out.println(vo.writer);
        System.out.println(vo.wdate);*/
        System.out.println(vo);
    }

    //3.삭제-delete,remove..      인자X,리턴O
    int delete(){
        System.out.println("delete()...");
        int x = 99;
        return x;
    }
    String delete2(){
        System.out.println("delete()...");
        String x = "lee";
        return x;
    }

    int[] delete3(){
        System.out.println("delete3()...");
        int[] sus = new int[3];
        return sus;
    }

    String[] delete4(){
        System.out.println("delete4()...");
        //String[] arr = new String[5];
        return new String[5];       //이렇게 할당 가능
    }

    public BoardVO delete5(){
        System.out.println("delete5()...");
        return new BoardVO();
    }

    public BoardVO[] delete6() {
        System.out.println("delete6()...");
        //return new BoardVO[3];    //null,null,null (null pointer exception 발생)
        BoardVO[] bvos = new BoardVO[3];        //배열을 생성한거지 안에 객체가 생성 된게 X
        for (int i = 0; i < bvos.length; i++) {
            bvos[i] = new BoardVO(10,"aaa","bbb","ccc","ddd");        //객체 생성
        }
        return bvos;


    }

    //4.검색-search,read,select       인자 O, 리턴 O
    int select1(int x, int y){
        System.out.println("select1()...");
        return 1;
    }

    int select2(int x1, int x2, int x3, int x4){
        System.out.println("select2()...");
        return x1+x2+x3+x4;
    }

    //... 연산자 -  매개변수선언 영역에 사용되며, 해당 변수는 배열이 된다.
    //             매개변수의 개수 제한 없이 원하는 만큼 입력 가능
    int select3(int ... arr){             //int...x = 배열처럼 취급
        System.out.println("select3()...");
        System.out.println(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        return sum;
    }


    public BoardVO[] select4(BoardVO bvo) {
        System.out.println("select4()...");
        BoardVO[] bvos = new BoardVO[3];
        for (int i = 0; i < bvos.length; i++) {
            bvos[i] = bvo;
        }
        return bvos;
    }

    public BoardVO[] select5(String searchKey, String searchWord) {
        System.out.println("select5()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        BoardVO[] bvos = new BoardVO[3];
        for (int i = 0; i < bvos.length; i++) {
            bvos[i] = new BoardVO();
        }
        return bvos;

    }
}
