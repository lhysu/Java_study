package test.com;

public class MissionMain {
    public static void main(String[] args) {
        System.out.println("hello");

        Student[] st = new Student[3];
        for (int i = 0; i < 3; i++) {
            st[i] = new Student();
        }// end for

        for (int i = 0; i < st.length; i++) {
            int total = st[i].kor + st[i].eng + st[i].math;
            double avg = total / 3;
            String grade = "";
            if (avg >= 90) {
                grade = "A";
            } else if (avg >= 80) {
                grade = "B";
            } else if (avg >= 70) {
                grade = "C";
            } else {
                grade = "D";
            }

            System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%s\n",st[i].number,
                    st[i].name,st[i].kor,st[i].eng,st[i].math,total,avg, grade);
        }//end for

        System.out.println("=================================");


        for (int i = 0; i < 3; i++) {
            st[i] = new Student(i+1,"lee",90+i,70+i,80+i);
        }// end for

        for (int i = 0; i < st.length; i++) {
            int total = st[i].kor + st[i].eng + st[i].math;
            double avg = total / 3;
            String grade = "";
            if (avg >= 90) {
                grade = "A";
            } else if (avg >= 80) {
                grade = "B";
            } else if (avg >= 70) {
                grade = "C";
            } else {
                grade = "D";
            }

            System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%s\n",st[i].number,
                    st[i].name,st[i].kor,st[i].eng,st[i].math,total,avg, grade);
        }//end for


    }//end main
}//end class
