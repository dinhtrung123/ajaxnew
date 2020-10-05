/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author admin
 */
public class Client {
    public static void main(String[] args) {
    Order order = new FastFoodOrderBuilder()
                .orderType(OrderType.ON_SITE).orderBread(BreadType.OMELETTE)
                .orderSauce(SauceType.SOY_SAUCE).build();
        System.out.println(order);
        
        int[] a = {1,2,3} ;
        int[] b = new int[a.length+1]  ;
        b[b.length - 1] = 6 ;
       
        System.out.println("kkk" + b[3]);
     
    }
     
}
