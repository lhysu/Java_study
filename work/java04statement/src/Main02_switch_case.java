public class Main02_switch_case {
    public static void main(String[] args) {
        System.out.println("hello");

        int x = 10;
        switch (x){     //실수타입은 x에 사용 불가
            case 10:
                System.out.println("10...");
                break;
            case 20:
                System.out.println("20...");
                break;
            default:
                System.out.println("other...");
                break;
        }

        String key = "java";
        switch(key){
            case "java":
                System.out.println("백엔드...");
                break;
            case "html":
                System.out.println("프론트엔드...");
                break;
            default:
                System.out.println("기타...");
                break;
        }

        int su1=10, su2=20;
        char c = '-';
        switch(c){
            case '+':
                System.out.println(su1 + su2);
                break;
            case '-':
                System.out.println(su1 - su2);
                break;
            default:
                System.out.println("잘못 입력...");
                break;
        }

    }//end main
}//end class
