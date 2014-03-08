/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.photostudio.app.AppConfig;
import com.tonata.photostudio.model.equipmentPackage.Speaker;
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
public class SpeakerTest {
    private static Speaker.Builder speaker;
    private static Speaker.Builder newSpeaker;
    public SpeakerTest() {
    }

    @Test
    public void createTest(){
      speaker.name("Dixon Black").build();
      Assert.assertEquals(speaker.build().getName() ,"Dixon Black" );
    }
    @Test
    public void updateTest(){
      newSpeaker.equals(speaker);
      Assert.assertEquals(newSpeaker.build().cost() + 200,899.99 );
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        speaker = (Speaker.Builder)ctx.getBean("speaker");
        newSpeaker = (Speaker.Builder)ctx.getBean("speaker");
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
