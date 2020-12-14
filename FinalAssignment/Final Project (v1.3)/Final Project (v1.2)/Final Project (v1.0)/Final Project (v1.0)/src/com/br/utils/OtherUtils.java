/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.utils;

import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

/**
 *
 * @author Alex Zhu
 */
public class OtherUtils {
    
    public static boolean isValiDate(String str){
        boolean convertSuccess = true;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try{
            format.setLenient(false);
            format.parse(str);
        }catch(Exception e){
            convertSuccess = false;
        }
        return convertSuccess;
    }
    
    public static boolean isInteger(String str){
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }
    
}
