//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main01_if {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(args.length);
        if (args == null){
            System.out.println("args==null");
        }
        Integer x = 10;
        System.out.println(x.toString()+99);

        double avg = 77;
        if (avg<=100 && avg>=90){
            System.out.println("A");
        } else if (avg>=80){
            System.out.println("B");
        } else if (avg>=70){
            System.out.println("C");
        } else if (avg>=60){
            System.out.println("D");
        }
    }//end main
}//end class