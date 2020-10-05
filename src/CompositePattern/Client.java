/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositePattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Client {
    public static void main(String[] args) {

    List<FileLeaf>  folder  = readFile("D:\\txt.txt");
        System.out.println("v" + folder);  
    }
    
    
    public static List<FileLeaf> readFile( String fileName){
          List<FileLeaf> list = new ArrayList<>();
           String[] line = null;
            BufferedReader br  = null ;
        try {
           FileReader file  =  new FileReader(fileName) ;
            br = new BufferedReader(file);
           String d  ;
           int i  = 0;
             while ((d =br.readLine())!=null){               
		 line = d.split(";");
		 String name =String.valueOf(line[0]);
		 long size= Long.parseLong(line[1]) ;
                 FileLeaf leaf  =  new FileLeaf(name, size) ;
		 list.add(leaf);
                 i++ ;
	    }
           return list ;
           
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
              try {
                  br.close();
              } catch (IOException ex) {
                  ex.getStackTrace() ;
              }
        }
 
        return null ;
    }
   
}
