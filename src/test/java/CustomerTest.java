/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.photostudio.app.AppConfig;
import com.tonata.photostudio.model.Customer;
import com.tonata.photostudio.model.workTypePackage.Flyer;
import com.tonata.photostudio.model.workTypePackage.Photograph;
import com.tonata.photostudio.model.workTypePackage.Work;
import java.util.ArrayList;
import java.util.List;
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
public class CustomerTest {
    private static Customer.Builder cust;
    private static Customer.Builder newCust;
    private static List<Work> w;
    private static Photograph p;
    private static Flyer f;
    public CustomerTest() {
    }

    
    @Test
    public void creationTest() {
        w = new ArrayList<Work>();
        w.add(p);
        w.add(f);
        
        cust.firstName("Martha").artWork(w).build();
        Assert.assertEquals(cust.build().getW().get(1).cost(4, 500), 2000.0);
    }
    
    @Test
    public void updateTest(){
        newCust.equals(cust);
        newCust.lastName("Reynolds").build();
        Assert.assertEquals(newCust.build().getLastName() , "Reynolds");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        cust = (Customer.Builder)ctx.getBean("customer");
        newCust = (Customer.Builder)ctx.getBean("customer");
        Photograph.Builder pBuild = (Photograph.Builder)ctx.getBean("photo");
        Flyer.Builder fBuild = (Flyer.Builder)ctx.getBean("flyer");
        p =  pBuild.description("wedding captures").build();
        
        f = fBuild.description("valentines event").build();
        
        
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
