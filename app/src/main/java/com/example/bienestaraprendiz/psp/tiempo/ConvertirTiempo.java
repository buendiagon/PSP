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


        return "";
    }
}
