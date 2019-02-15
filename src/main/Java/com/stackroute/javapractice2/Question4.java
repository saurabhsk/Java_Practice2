package com.stackroute.javapractice2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class Question4 {

     String getUpperCase(String inputFilepath) throws IOException {
         if(inputFilepath.equalsIgnoreCase(""))return null;
         File file = new File(inputFilepath);
         StringBuffer buff = new StringBuffer("");
         BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
         String str;
         while((str=bufferedReader.readLine())!=null){
             buff.append(str);
         }

        return buff.toString().toLowerCase(Locale.ENGLISH).trim();
    }
}
