package test.com;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        //여러개의 오류처리를 위한 멀티캐치문 (Surround try-catch)\

        //try블럭에서 오류가 발생하든 하지 않든 상관 없이 반드시 수행하는 블럭(finally)
        try{
            System.out.println(Integer.parseInt("a100"));

            String str = null;
            System.out.println(str.length());

            System.out.println(10/0);

            int[][] suss = new int[5][5];
            System.out.println(suss[5][5]);

        }catch(NumberFormatException ex){
            System.out.println("catch...NumberFormatException");
        }catch(NullPointerException ex){
            System.out.println("catch...NullPointerException");
        }catch(ArithmeticException ex){
            System.out.println("catch...ArithmeticException");
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("catch...ArrayIndexOutOfBoundsException");
        }catch (Exception ex){
            System.out.println("catch...Exception");
            //가장 상위의 Exception-미처 잡지 못한 exception을 처리
            //모든 Exception 포함
        }finally{
            System.out.println("finally.....");         //보통 스캐너 등을 닫아주는 역할

        }


        System.out.println("end main...");
    }//end main


}//end class
