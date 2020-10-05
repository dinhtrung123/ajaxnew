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
public class WoodTable  implements Table{

    @Override
    public void create() {
        System.out.println("tạo bàn gỗ thành công");
    }
    
}
