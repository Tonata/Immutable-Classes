/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.photostudio.app.AppConfig;
import com.tonata.photostudio.model.Photographer;
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
public class PhotographerTest {
    private static Photographer.Builder p;
    private static Photographer.Builder newP;
    public PhotographerTest() {
    }

    
    
    @Test
    public void createTest() {
        p.firstName("Casey").lastName("Smith").build();
        Assert.assertEquals(p.build().getName(), "Casey");
    }
    
    
    @Test
    public void updateTest(){
        newP.equals(p);
        newP.lastName("Brown").build();
        Assert.assertEquals(newP.build().getLastName() , "Brown");
    }
    

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        p = (Photographer.Builder)ctx.getBean("photographer");
        newP = (Photographer.Builder)ctx.getBean("photographer");
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
