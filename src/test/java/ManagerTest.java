/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.photostudio.app.AppConfig;
import com.tonata.photostudio.model.Manager;
import com.tonata.photostudio.model.workTypePackage.Photograph;
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
public class ManagerTest {
    private static Manager.Builder manager;
    private static Manager.Builder newManager;
    private static Photograph  photo;
    public ManagerTest() {
    }

    
    @Test
    public void creationTest() {
        manager.firstName("Kross").validWork(photo).build();
        Assert.assertEquals(manager.build().getName() , "Kross");
    }
    
    @Test
    public void updateTest(){
        newManager.equals(manager);
        newManager.lastName("Michaels").build();
        Assert.assertEquals(newManager.build().getLastName() , "Michaels");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        manager = (Manager.Builder)ctx.getBean("manager");
        newManager = (Manager.Builder)ctx.getBean("manager");
        Photograph.Builder pBuild = (Photograph.Builder)ctx.getBean("photo");
        photo = pBuild.description("wedding").build();
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
