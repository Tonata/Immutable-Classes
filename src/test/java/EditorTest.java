/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.photostudio.app.AppConfig;
import com.tonata.photostudio.model.Editor;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class EditorTest {
    private static Editor.Builder editor;
    private static Editor.Builder newEditor;
    public EditorTest() {
    }

    
    @Test
    public void creationTest() {
        editor.firstName("Michael").lastName("Louw").build();
        Assert.assertEquals(editor.build().getName(), "Michael");
    }
    
    @Test
    public void updateTest(){
        newEditor.equals(editor);
        newEditor.firstName("Mike").build();
        Assert.assertEquals(newEditor.build().getName(), "Mike");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        editor = (Editor.Builder)ctx.getBean("editor");
        newEditor = (Editor.Builder)ctx.getBean("editor");
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
