/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class Client {
      public static void main(String[] args) {
//		Computer pc = ComputerFactory.getComputer("PC","2 GB","500 GB","2.4 GHz");
//		Computer server = ComputerFactory.getComputer("Server","16 GB","1 TB","2.9 GHz");
//		System.out.println("Factory PC Config::"+pc);
//		System.out.println("Factory Server Config::"+server);
    BufferedReader br = null;

        try {   
            br = new BufferedReader(new FileReader("D:\\new.txt"));       

            System.out.println("Đọc nội dung file sử dụng phương thức readLine()");

            String textInALine = null ;
       
          String b ="" ;
          StringBuilder a =  new StringBuilder() ;
            while ((textInALine = br.readLine()) != null) {
          b = b+ b.concat(textInALine);
            //   a.append(textInALine);
                textInALine = br.readLine();
            }
                            System.out.println(b);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         
              
	}
}
