/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tonata.photostudio.app.AppConfig;
import com.tonata.photostudio.model.equipmentPackage.Smartboard;
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
public class SmartboardTest {
    private static Smartboard.Builder board;
    private static Smartboard.Builder newBoard;
    public SmartboardTest() {
    }

    @Test
    public void createTest(){
        board.name("SMART Tech:Smartboard").code("A100").build();
        Assert.assertEquals(board.build().getCode() ,"A100" );
    }
    @Test
    public void updateTest(){
        newBoard.equals(board);
        newBoard.code("B100").build();
        Assert.assertEquals(newBoard.build().getCode() ,"B100" );
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
         ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
         board = (Smartboard.Builder)ctx.getBean("smartboard");
         newBoard = (Smartboard.Builder)ctx.getBean("smartboard");
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
