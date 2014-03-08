/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.photostudio.app.AppConfig;
import com.tonata.photostudio.model.Photographer;
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
public class PhotographTest {
    private static Photograph.Builder photo;
    private static Photograph.Builder newPhoto;
    private static Photographer gr;
    private static Photographer.Builder aPhotographer;
    public PhotographTest() {
    }

    @Test
    public void createTest(){
       gr = aPhotographer.firstName("John").build();
       photo.description("flowers").photographer(gr).build();
       Assert.assertEquals(photo.build().getPhotographer().getName() , "John");
    }
    @Test
    public void updateTest(){
       newPhoto.equals(photo);
       gr = aPhotographer.firstName("Logan").build();
       newPhoto.photographer(gr).build();
       Assert.assertEquals(newPhoto.build().getPhotographer().getName() , "Logan");
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        photo = (Photograph.Builder)ctx.getBean("photo");
        newPhoto =(Photograph.Builder)ctx.getBean("photo");
        aPhotographer = (Photographer.Builder)ctx.getBean("photographer");
        
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
