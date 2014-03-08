/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.photostudio.app.AppConfig;
import com.tonata.photostudio.model.Studio;
import com.tonata.photostudio.model.equipmentPackage.Camera;
import com.tonata.photostudio.model.equipmentPackage.DesktopPC;
import com.tonata.photostudio.model.equipmentPackage.Equipment;
import com.tonata.photostudio.model.equipmentPackage.Smartboard;
import com.tonata.photostudio.model.equipmentPackage.Speaker;
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
public class StudioTest {
    private static Studio.Builder studio;
    private static Studio.Builder studioNew;
    private static List<Equipment> equipment;
    private static Smartboard boardOne;
    private static DesktopPC computer;
    private static Camera camera;
    
    public StudioTest() {
    }
    @Test
    public void createTest(){
       equipment.add(boardOne);
       equipment.add(computer);
       equipment.add(camera);
       
       studio.equipment(equipment).squareMeters(400.76).build();
       Assert.assertEquals(studio.build().getEquipment().get(1), computer);
    }
    @Test
    public void updateTest(){
        studioNew.equals(studio);
        studioNew.squareMeters(400.70).build();
        Assert.assertEquals(studioNew.build().getSquareMeters() , 400.70);
    }
    

    @BeforeClass
    public static void setUpClass() throws Exception {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
       studio = (Studio.Builder)ctx.getBean("studio");
       studioNew = (Studio.Builder)ctx.getBean("studio");
       equipment = new ArrayList<Equipment>();
       
       Smartboard.Builder b = (Smartboard.Builder)ctx.getBean("smartboard");
       boardOne = b.name("SMART Tech: Smartboard").build();
       Camera.Builder c = (Camera.Builder)ctx.getBean("camera");
       camera = c.name("Canon D990").build();
       DesktopPC.Builder d = (DesktopPC.Builder)ctx.getBean("desktop");
       computer = d.name("Dell XP360").build();
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
