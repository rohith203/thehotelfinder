/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehotelfinder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Rohith
 */
public class MyDate{
    public static Date toDate(String s){
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM, yyyy");
        Date resDate = new Date();
        try{
            resDate = formatter.parse(s);
        }catch(ParseException e){
            System.out.println(e);
        }
        return resDate;
    }
    
    public static String getString(Date d){
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyss");
        String s = formatter.format(d);
        return s;
    }
}
