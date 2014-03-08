/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.photostudio.app.AppConfig;
import com.tonata.photostudio.model.equipmentPackage.DesktopPC;
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
public class DesktopPCTest {
    private static DesktopPC.Builder pc;
    private static DesktopPC.Builder pcNew;
    public DesktopPCTest() {
    }

    @Test
    public void createTest(){
        pc.name("Apple Mac Pro").code("A293B").build();
        Assert.assertEquals(pc.build().getName() , "Apple Mac Pro");
    }
    @Test
    public void updateTest(){
        pcNew.equals(pc);
        pcNew.name("Apple Mac Pro").code("D2003").build();
        Assert.assertEquals(pcNew.build().getCode() , "D2003");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        pc = (DesktopPC.Builder)ctx.getBean("desktop");
        pcNew = (DesktopPC.Builder)ctx.getBean("desktop");
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
