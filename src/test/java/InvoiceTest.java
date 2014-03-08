/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.photostudio.app.AppConfig;
import com.tonata.photostudio.model.Cashier;
import com.tonata.photostudio.model.Invoice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
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
public class InvoiceTest {
    private static Invoice.Builder invoice;
    private static Invoice.Builder invoiceNew;
    private static Cashier cashier;
    public InvoiceTest() {
    }
    @Test
    public void createTest(){
        invoice.cashier(cashier);
        Assert.assertEquals(invoice.build().getCashier().getName() , "Jenny");
    }
    @Test
    public void updateTest(){
        invoiceNew.equals(invoice);
        Assert.assertEquals(invoiceNew.build().getInvoiceNum() , 101);
    }
   

    @BeforeClass
    public static void setUpClass() throws Exception {
         ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
         invoice = (Invoice.Builder)ctx.getBean("invoice");
         invoiceNew = (Invoice.Builder)ctx.getBean("invoice");
         Cashier.Builder c = (Cashier.Builder)ctx.getBean("cashier");
         cashier = c.firstName("Jenny").build();
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
