package com.hackaton.data.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Date   { 

public static void main(String[] args) throws ParseException {

    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    java.util.Date y1 = sdf1.parse("25/06/2018");
    java.util.Date y2 = sdf2.parse("25/06/2018 15:45:35");

    System.out.println("y1: " + sdf2.format(y1));
    System.out.println("y2: " + sdf2.format(y2));;

    }

}