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
public class WoodFactory  extends FurnitureAbstractFactory{

    @Override
    public Chair createChair() {
        return  new WoodChair() ;
    }

    @Override
    public Table createTable() {
        return  new WoodTable() ;
    }
    
}
