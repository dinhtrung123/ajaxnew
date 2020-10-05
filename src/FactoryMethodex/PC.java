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
public class PC extends Computer{
   private String ram ;
      private String hdd ;
         private String cpu ;

    @Override
    public String toString() {
        return "PC{" + "ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + '}';
    }
         
    public PC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRam() {
    return this.ram ;
    }

    @Override
    public String getCpu() {
   return this.cpu ;
    }

    @Override
    public String getHdd() {
  return this.hdd ;
    }
         

  
         
    
}
