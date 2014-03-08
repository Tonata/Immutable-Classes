/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.photostudio.app.AppConfig;
import com.tonata.photostudio.model.Editor;
import com.tonata.photostudio.model.workTypePackage.Flyer;
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
public class FlyerTest {
    private static Flyer.Builder flyer;
    private static Flyer.Builder newFlyer;
    private static Editor editor;
    private static Editor.Builder ed;
    public FlyerTest() {
    }

    @Test
    public void createTest() {
        editor = ed.firstName("Cale").lastName("Matthews").build();
        flyer.description("HHS Matric Dance Afterparty").editor(editor).build();
        Assert.assertEquals(flyer.build().getDescription(), "HHS Matric Dance Afterparty");
     }
    @Test
    public void updateTest() {
        newFlyer.equals(flyer);
        newFlyer.description("THS Dance Afterparty").build();
        Assert.assertEquals(newFlyer.build().getDescription(), "THS Dance Afterparty");
     }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        flyer = (Flyer.Builder)ctx.getBean("flyer");
        newFlyer = (Flyer.Builder)ctx.getBean("flyer");
        ed = (Editor.Builder)ctx.getBean("editor");
       
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
