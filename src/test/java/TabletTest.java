/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.photostudio.app.AppConfig;
import com.tonata.photostudio.model.equipmentPackage.Tablet;
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
public class TabletTest {
    private static Tablet.Builder tablet;
    private static Tablet.Builder newTablet;
    public TabletTest() {
    }

    @Test
    public void createTest(){
        tablet.name("Sony Xperia Z").code("4A").build();
        Assert.assertEquals(tablet.build().getName() , "Sony Xperia Z");
    }
    @Test
    public void updateTest(){
        newTablet.equals(tablet);
        newTablet.code("2A").build();
        Assert.assertEquals(newTablet.build().getCode(), "2A");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
         ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
         tablet = (Tablet.Builder)ctx.getBean("tablet");
         newTablet = (Tablet.Builder)ctx.getBean("tablet");
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
