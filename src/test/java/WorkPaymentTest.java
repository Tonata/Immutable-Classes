/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.photostudio.app.AppConfig;
import com.tonata.photostudio.model.WorkPayment;
import com.tonata.photostudio.model.paymentPackage.Cash;
import com.tonata.photostudio.model.paymentPackage.Payment;
import com.tonata.photostudio.model.workTypePackage.Work;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class WorkPaymentTest {
    private static WorkPayment.Builder wPay;
    private static Payment payment;
    private static Work type;
    
    public WorkPaymentTest() {
    }
    @Test
    public void createTest(){
       // wPay.payment(c).workType(type).build();
        
    }
    @Test
    public void updateTest(){
        
    }
    

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        wPay = (WorkPayment.Builder)ctx.getBean("work_payment");
        Cash.Builder cash = (Cash.Builder)ctx.getBean("cash");
       // c = cash.amount(7000.00).build();
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
