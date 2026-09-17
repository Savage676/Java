/**
 * @(#)TestForLoop.java
 *
 *
 * @author COM102
 * @version 1.00 2018/10/29
 */


public class TestForLoop {

    public static void main (String[] args)
    {

        String[] studentName = {"John","Mary", "Stephen","James", "Amy", "Fiona"};
        int[] studentMarks = {90,56,70,66,81,96};

        for(int i = studentName.length - 1; i >=0;i--){

            System.out.println("Student = " + studentName[i] + ", his/her mark =" + studentMarks[i]);
        }

        System.out.println();

        int HighestMark = -1;
        String HighestMarkStudent = "";

        for (int i = 0;i < studentMarks.length;i++){
            if (studentMarks[i] > HighestMark) {
                HighestMark = studentMarks[i];
                HighestMarkStudent = studentName[i];
            }
        }
        System.out.println(HighestMarkStudent + ":" +HighestMark);



    }


}