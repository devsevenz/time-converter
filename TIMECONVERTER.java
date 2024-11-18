import java.util.Scanner;

public class TIMECONVERTER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours;
        int minutes;
        int seconds;
        String choice;
        boolean quit = true;

        System.out.println("TIME CONVERTER!");
    //START
        while(quit){


    //INPUT
            System.out.print("ENTER HOURS:  ");
                if (!sc.hasNextInt()){
                    System.out.println("Please enter a number!");
                    return;
                }else {
                    hours = sc.nextInt();
                }
            System.out.print("ENTER MINUTES:  ");
                if (!sc.hasNextInt()){
                    System.out.println("Please enter a number!");
                    return;
                }else {
                    minutes = sc.nextInt();
                }
            System.out.print("ENTER SECONDS:  ");
                if (!sc.hasNextInt()){
                    System.out.println("Please enter a number!");
                    return;
                }else{
                    seconds = sc.nextInt();
                }

    //PROCESS

        //HOURS
           int s_hours = hours * 60 * 60 ;
        //MINUTES
            int s_minutes = minutes * 60 ;

        //SECONDS
            int s_seconds = seconds + s_hours + s_minutes ;


    //OUTPUT
         System.out.println("TOTAL TIME IN SECONDS IS: " + s_seconds);
        }
    }
}