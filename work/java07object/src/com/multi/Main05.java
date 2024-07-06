package com.multi;

import test.com.NoteBook;

public class Main05 {
    public static void main(String[] args) {
        System.out.println("hello");

        //패키지가 다른 경우에도 객체 생성을 할수 있도록
        //public 선언을 해줘야 한다.
        NoteBook nb = new NoteBook();

        nb = new NoteBook("TT", 300, 3.3);

        nb = new NoteBook("UU", 33.33);


    }//end  main
}//end class
