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
public class Server extends Computer{
     private String ram ;
     private String hdd ;
     private String cpu ;

    @Override
    public String toString() {
        return "Server{" + "ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + '}';
    }

     
     
    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRam() {
       return  this.ram ;
    }

    @Override
    public String getCpu() {
        return this.cpu ;
    }

    @Override
    public String getHdd() {
      return  this.hdd ;
    }
     

}
