/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.photostudio.app.AppConfig;
import com.tonata.photostudio.model.Cashier;
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
public class CashierTest {
    private static Cashier.Builder cashier;
    private static Cashier.Builder newCashier;
    public CashierTest() {
    }

    
    @Test
    public void cashierCreationTest() {
        cashier.firstName("Tonata").lastName("Nakashololo").build();
        Assert.assertEquals(cashier.build().getName(), "Tonata");
    }
    
    @Test
    public void cashierUpdateTest(){
        newCashier.equals(cashier);
        newCashier.firstName("Tom").build();
        Assert.assertEquals(newCashier.build().getLastName(), "Nakashololo");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        cashier = (Cashier.Builder)ctx.getBean("cashier");
        newCashier = (Cashier.Builder)ctx.getBean("cashier");
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
