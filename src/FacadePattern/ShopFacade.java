/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePattern;

/**
 *
 * @author admin
 */
public class ShopFacade implements ShopFacadeImpl{
    private  static  ShopFacade INSTANCE = null;
    private AccountService accountService = null;
    private PaymentService paymentService = null;
    private ShippingService shippingService;
    private EmailService emailService;
    private SmsService smsService;
    
    
      private ShopFacade()  {
          if(accountService == null)
          {
             accountService = new AccountService();
          }
          if(paymentService == null)
          {
               paymentService = new PaymentService();
          }
         if(shippingService == null)
         {
              shippingService = new ShippingService();
         }
        if(emailService == null)
        {
            emailService = new EmailService();
        }
        if(smsService == null)
        {
         smsService = new SmsService();

        }
        
    }
      public static ShopFacade getInstance() {        
           if(INSTANCE == null)
          {
              INSTANCE = new ShopFacade() ;
          }
          return INSTANCE ;
      } 
      
       public  void buyProductByPaypalWithStandardShipping(String email ,String mobilePhone){
          accountService.getAccount(email);
          paymentService.paymentByPaypal(); 
          shippingService.expressShipping(); 
          emailService.sendMail(email);
          smsService.sendSMS(mobilePhone);
          System.out.println("done");
      }

    @Override
    public void buyProductByCashWithFreeShipping(String email) {
         accountService.getAccount(email);
          paymentService.paymentByCash(); 
          shippingService.freeShipping(); 
          emailService.sendMail(email);
          smsService.sendSMS("0971111661");
          System.out.println("done");
    }
    
}
