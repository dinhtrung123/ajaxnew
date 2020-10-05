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
public class PlasticChair implements Chair{

    @Override
    public void create() {
        System.out.println("tạo ghế nhựa thành công");
    }
    
}
