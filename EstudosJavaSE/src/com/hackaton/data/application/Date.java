package com.hackaton.data.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class Date {

    public static void main(String[] args) throws ParseException {

        // data/hora atual
        LocalDateTime agora = LocalDateTime.now();

        // formatar a data
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String dataFormatada = formatterData.format(agora);

        // formatar a hora
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = formatterHora.format(agora);
        
        // formatar hora, data e hora, data e hora EST.
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        // converter as horas para a timeZone de certa região neste caso EST. Horário Padrão Oriental.
        sdf3.setTimeZone(TimeZone.getTimeZone("EST"));

        // aqui dois exemplos um somente  data "sdf1" e outro com data e hora "sdf2" simpleDateFormat.
        java.util.Date y1 = sdf1.parse("24/02/2022");
        java.util.Date y2 = sdf2.parse("24/02/2022 15:45:35");
        // Aqui a impressão da hora atual e data atual.
        System.out.println("horaAtual: " + (horaFormatada));
        System.out.println("dataAtual: " + (dataFormatada));

        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        //Horas convertidas para EST.
        System.out.println("------------------------");
        System.out.println("y1: " + sdf3.format(y1));
        System.out.println("y2: " + sdf3.format(y2));
        
        ;

    }

}