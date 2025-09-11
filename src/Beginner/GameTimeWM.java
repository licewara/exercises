package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class GameTimeWM {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            int startHour = sc.nextInt();
            int startMinute = sc.nextInt();
            int endHour = sc.nextInt();
            int endMinute = sc.nextInt();

            int i, j;

            if (startHour == endHour && startMinute == endMinute){
                System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            } else if (startHour > endHour && startMinute > endMinute){
                for (i = 0; startHour < (24 + endHour); i++){
                    startHour++;
                }
                for (j = 0; startMinute < (60 + endMinute); j++){
                    startMinute++;
                }
                //1 hora à menos, já que os minutos finais é menor do que os minutos iniciais
                System.out.println("O JOGO DUROU " + (i-1) + " HORA(S) E " + j + " MINUTO(S)");
            } else if (startHour > endHour && startMinute < endMinute){
                for (i = 0; startHour < (24 + endHour); i++){
                    startHour++;
                }
                for (j = 0; startMinute < endMinute; j++){
                    startMinute++;
                }
                System.out.println("O JOGO DUROU " + i + " HORA(S) E " + j + " MINUTO(S)");
            } else if (startHour < endHour && startMinute < endMinute){
                for (i = 0; startHour < endHour; i++){
                    startHour++;
                }
                for (j = 0; startMinute < endMinute; j++){
                    startMinute++;
                }
                System.out.println("O JOGO DUROU " + i + " HORA(S) E " + j + " MINUTO(S)");
            } else if (startHour < endHour && startMinute > endMinute){
                for (i = 0; startHour < endHour; i++){
                    startHour++;
                }
                for (j = 0; startMinute < (60 + endMinute); j++){
                    startMinute++;
                }
                System.out.println("O JOGO DUROU " + (i-1) + " HORA(S) E " + j + " MINUTO(S)");
            } else if (startHour == endHour && startMinute < endMinute) {
                for (i = 0; startMinute < endMinute; i++) {
                    startMinute++;
                }
                System.out.println("O JOGO DUROU 0 HORA(S) E " + i + " MINUTO(S)");
            }
        }
    }
}