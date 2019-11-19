import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        
        String startTime;
        String endTime;
        Scanner input = new Scanner(System.in);
        System.out.println("startTime: ");
        startTime = input.next();
        System.out.println("endTime: ");
        endTime = input.next();
        System.out.println("OUTPUT:" + countBells(startTime,endTime));
    }

    public static int countBells(String startTime, String endTime){

        int counter = 0;
        int twelveFlag = 12;

        if ((startTime.indexOf(":") == 1) || (startTime.indexOf(":") == 2) &
            (endTime.indexOf(":") == 1) || (endTime.indexOf(":") == 2)) 
            {
                int sHours = Integer.parseInt(startTime.substring(0,startTime.indexOf(":")));
                int eHours = Integer.parseInt(endTime.substring(0,endTime.indexOf(":")));
                
                if (sHours > twelveFlag) {
                    if (sHours < eHours) {
                        sHours = sHours - twelveFlag;
                    }
                    int sMinutes = Integer.parseInt(startTime.substring(3,5));
                    if (sMinutes > 0) sHours = 0;
                } else {
                    int sMinutes = Integer.parseInt(startTime.substring(2,4));
                }

                if (eHours > twelveFlag){
                    eHours = eHours - twelveFlag;
                    int eMinutes = Integer.parseInt(endTime.substring(3,5));
                } else {
                    int eMinutes = Integer.parseInt(endTime.substring(2,4));
                }
                counter = sHours + eHours;
        }
        return counter;
    }
}