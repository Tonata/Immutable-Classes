/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.photostudio.app.AppConfig;
import com.tonata.photostudio.model.equipmentPackage.Camera;
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
public class CameraTest {
    private static Camera.Builder cam;
    private static Camera.Builder newCam;
    public CameraTest() {
    }

    @Test
    public void createTest(){
        cam.name("Canon D900").code("2AA").build();
        Assert.assertEquals(cam.build().getName(),"Canon D900");
    }
    @Test
    public void updateTest(){
        newCam.equals(cam);
        newCam.name("Nikon 300C").build();
        Assert.assertEquals(newCam.build().getName(),"Nikon 300C");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        cam = (Camera.Builder)ctx.getBean("camera");
        newCam = (Camera.Builder)ctx.getBean("camera");
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
