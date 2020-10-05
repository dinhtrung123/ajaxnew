/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author admin
 */
public class FlasticFactory extends FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
        return new PlasticChair() ;
    }

    @Override
    public Table createTable() {
        return  new PlasticTable() ;
    }

   
  
    
}
