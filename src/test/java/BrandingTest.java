/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.photostudio.app.AppConfig;
import com.tonata.photostudio.model.Editor;
import com.tonata.photostudio.model.workTypePackage.Branding;
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
public class BrandingTest {
    private static Branding.Builder design;
    private static Branding.Builder newDesign;
    private static Editor editor;
    private static Editor.Builder ed;
    public BrandingTest() {
    }

    @Test
    public void createTest(){
        editor = ed.firstName("Cale").lastName("Matthews").build();
        design.description("Chippies Take-away logo").editor(editor).build();
        Assert.assertEquals(design.build().getDescription(),"Chippies Take-away logo" );
    }
    @Test
    public void updateTest(){
        newDesign.equals(design);
        editor = ed.firstName("Calvin").lastName("Coleman").build();
        newDesign.editor(editor).build();
        Assert.assertEquals(newDesign.build().getEditor().getLastName(),"Coleman" );
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        design = (Branding.Builder)ctx.getBean("branding");
        newDesign = (Branding.Builder)ctx.getBean("branding");
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
