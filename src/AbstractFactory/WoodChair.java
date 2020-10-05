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
public class WoodChair implements  Chair{

    @Override
    public void create() {
        System.out.println(" tạo ghế gõ thành công");
    }
    
}
