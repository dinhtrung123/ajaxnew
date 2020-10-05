/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodex;

/**
 *
 * @author admin
 */
public class ComputerFactory {
    
    public static Computer  getComputer(String type ,  String ram ,String cpu ,String hdd) {
        if(type.equals("PC"))
        {
            return  new PC(ram, hdd, cpu) ;
        }else if (type.equals("Server"))
        {
            return new Server(ram, hdd, cpu);
        }
        return null ;
    }
    
}
