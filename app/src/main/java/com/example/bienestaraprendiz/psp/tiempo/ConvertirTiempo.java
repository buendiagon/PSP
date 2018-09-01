package com.example.bienestaraprendiz.psp.tiempo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ConvertirTiempo {
    Date date1;
    Date date2;
    int interrupciones;
    String[] tiempo1;
    String[] tiempo2;
    DateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");
    public String convertir(Date date1,Date date2,int interrupciones){
        this.date1=date1;
        this.date2=date2;
        this.interrupciones=interrupciones;
        tiempo1=dateFormat.format(date1).split(":");
        tiempo2=dateFormat.format(date2).split(":");
        int horasMillis1=Integer.valueOf(tiempo1[0])*60*60000;
        int minutosMillis1=Integer.valueOf(tiempo1[1])*60000;
        int segMillis1=Integer.valueOf(tiempo1[2])*1000;
        int horasMillis2=Integer.valueOf(tiempo2[0])*60*60000;
        int minutosMillis2=Integer.valueOf(tiempo2[1])*60000;
        int segMillis2=Integer.valueOf(tiempo2[2])*1000;
        int millis1=horasMillis1+minutosMillis1+segMillis1;
        int millis2=horasMillis2+minutosMillis2+segMillis2;
        int resultado=millis2-millis1;

        int convertHoras=((resultado/(60*60000))%24);
        int convertMinutos=((resultado/60000)%60);
        int convertSeg=((resultado/1000)%60);

        String mostrarHoras=String.format("%02d",convertHoras);
        String mostrarMinutos=String.format("%02d",convertMinutos);
        String mostrarSegundos=String.format("%02d",convertSeg);

        return mostrarHoras+":"+mostrarMinutos+":"+mostrarSegundos;
    }
}
