package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class GameTimeWM2 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int startHour = sc.nextInt();
        int startMinute = sc.nextInt();
        int endHour = sc.nextInt();
        int endMinute = sc.nextInt();

        int startTimeMinute = (startHour * 60) + startMinute;
        int endTimeMinute = (endHour * 60) + endMinute;

        //Onde, ENDTIME é maior que STARTTIME
        if (endTimeMinute > startTimeMinute) {
            int gameTimeMinute = endTimeMinute - startTimeMinute;

            int gameHour = gameTimeMinute / 60;
            int gameMinute = gameTimeMinute % 60;

            System.out.println("O JOGO DUROU " + gameHour + " HORA(S) E " + gameMinute + " MINUTO(S)");
        } else if (endTimeMinute < startTimeMinute) {
            int gameTimeMinute = (24 * 60) - (startTimeMinute - endTimeMinute);

            int gameHour = gameTimeMinute / 60;
            int gameMinute = gameTimeMinute % 60;

            System.out.println("O JOGO DUROU " + gameHour + " HORA(S) E " + gameMinute + " MINUTO(S)");
        } else if (startHour == endHour && startMinute == endMinute) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }

        sc.close();

    }
}