package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class EventTime {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String diaInicio = sc.nextLine();
        String horarioInicio = sc.nextLine();

        String diaFim = sc.nextLine();
        String horarioFim = sc.nextLine();

        //Separando as Strings
        String diSep = diaInicio.trim().split(" ")[1];
        String hiSep = horarioInicio.trim().split(" : ")[0];
        String miSep = horarioInicio.trim().split(" : ")[1];
        String siSep = horarioInicio.trim().split(" : ")[2];
        String dfSep = diaFim.trim().split(" ")[1];
        String hfSep = horarioFim.trim().split(" : ")[0];
        String mfSep = horarioFim.trim().split(" : ")[1];
        String sfSep = horarioFim.trim().split(" : ")[2];

        //Transformando elas em Int
        int di = Integer.parseInt(diSep);
        int hi = Integer.parseInt(hiSep);
        int mi = Integer.parseInt(miSep);
        int si = Integer.parseInt(siSep);
        int df = Integer.parseInt(dfSep);
        int hf = Integer.parseInt(hfSep);
        int mf = Integer.parseInt(mfSep);
        int sf = Integer.parseInt(sfSep);

        int segundosIniciais = (di * 86400) + (hi * 3600) + (mi * 60) + si;
        int segundosFinais = (df * 86400) + (hf * 3600) + (mf * 60) + sf;

        if (segundosFinais > segundosIniciais){
            int tempo = segundosFinais - segundosIniciais;

            int dias = tempo / 86400;
            int resto = tempo % 86400;
            int horas = resto / 3600;
            resto = resto % 3600;
            int minutos = resto / 60;
            int segundos = resto % 60;

            System.out.println(dias + " dia(s)");
            System.out.println(horas + " hora(s)");
            System.out.println(minutos + " minuto(s)");
            System.out.println(segundos + " segundo(s)");

        } else if (segundosFinais < segundosIniciais){
            int tempo = segundosIniciais - segundosFinais;

            int dias = tempo / 86400;
            int resto = tempo % 86400;
            int horas = resto / 3600;
            resto = resto % 3600;
            int minutos = resto / 60;
            int segundos = resto % 60;

            System.out.println(dias + " dia(s)");
            System.out.println(horas + " hora(s)");
            System.out.println(minutos + " minuto(s)");
            System.out.println(segundos + " segundo(s)");

        }



        sc.close();

    }

}