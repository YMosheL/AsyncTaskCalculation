package com.example.moshel.asynctaskcalculation;

import java.security.InvalidParameterException;

/**
 * Created by Moshe L on 6/21/2015.
 */
public class Calculation {

    public static double operate(String input){
       double i=0.0;
        String strRecived = input;
        String[] strSplit = strRecived.split(" ");
        if(strSplit.length!= 3){
            throw new InvalidParameterException("You have to pass 3 parameters");
        }
        if (strSplit[0].equals("add")){
             i = Integer.parseInt(strSplit[0] + strSplit [1]);
        }

        return i;
    }
}
