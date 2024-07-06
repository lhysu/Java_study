package test.com;

public class NoteBook {

    int price;
    double size;
    String model;

    //생성자 - 클래스명과 동일한 이름 상용, 리턴타입명시 안함.
    //생성자가 여러개 정의될 경우 매개변수의 타입, 순서 개수가 다르게 생성해야 한다.
    //생성자 오버로딩

    public NoteBook(){
        //전역변수의 초기화를 주 목적으로 한다.(초기화 안할거면 생략해도 됌)
        price = 100;
        size = 4.5;
        model = "SM";
        System.out.println("NoteBook()...");


    }//end no Args

    public NoteBook(String model, int price, double size){
        this.price = price;
        this.size = size;
        this.model = model;
        System.out.println("NoteBook(String model, int price, double size)...");
    }


    public NoteBook(String model, double size) {
        //this(); //매개변수로 받아서 쓰는 것 제외하고는 기본 생성자의 것을 쓰겠다.
                //생성자의 첫 라인에 있어야 함.(this 생성자의 첫라인에 반드시 콜)
        this("OO",777,77);

        System.out.println("NoteBook(String model, double size)...");
        this.model = model;
        this.size = size;
        //price = 100;
    }

    public NoteBook(String model, int price) {
        this.model = model;
        this.price = price;
    }
}
//코드라인 이동 단축기 : Ctrl + shift + 화살표 상하
