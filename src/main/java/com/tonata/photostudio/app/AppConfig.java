/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.photostudio.app;

import com.tonata.photostudio.model.Cashier;
import com.tonata.photostudio.model.Customer;
import com.tonata.photostudio.model.Editor;
import com.tonata.photostudio.model.Invoice;
import com.tonata.photostudio.model.Manager;
import com.tonata.photostudio.model.Photographer;
import com.tonata.photostudio.model.Studio;
import com.tonata.photostudio.model.User;
import com.tonata.photostudio.model.WorkPayment;
import com.tonata.photostudio.model.equipmentPackage.Camera;
import com.tonata.photostudio.model.equipmentPackage.DesktopPC;
import com.tonata.photostudio.model.equipmentPackage.Smartboard;
import com.tonata.photostudio.model.equipmentPackage.Speaker;
import com.tonata.photostudio.model.equipmentPackage.Tablet;
import com.tonata.photostudio.model.paymentPackage.Cash;
import com.tonata.photostudio.model.workTypePackage.Branding;
import com.tonata.photostudio.model.workTypePackage.Flyer;
import com.tonata.photostudio.model.workTypePackage.Photograph;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */
@Configuration
public class AppConfig {
    @Bean(name="cashier")
    public Cashier.Builder GetCashierService(){
        return new Cashier.Builder("222");
    }
    @Bean(name ="photographer")
    public Photographer.Builder GetPhotographerService(){
        return new Photographer.Builder("1234");
    }
    @Bean(name = "editor")
    public Editor.Builder GetDesignerService(){
        return new Editor.Builder("0101");
    }
    @Bean(name = "customer")
    public Customer.Builder GetCustomerService(){
        return new Customer.Builder("1");
    }
    @Bean(name = "manager")
    public Manager.Builder GetManagerService(){
        return new Manager.Builder("1B");
    }
    @Bean(name="photo")
    public Photograph.Builder GetPhotoService(){
        return new Photograph.Builder();
    }
    @Bean(name="flyer")
    public Flyer.Builder GetFlyerService(){
        return new Flyer.Builder();
    }
    @Bean(name="branding")
    public Branding.Builder GetBrandingService(){
        return new Branding.Builder();
    }
    @Bean(name="camera")
    public Camera.Builder GetCameraService(){
        return new Camera.Builder();
    }
    @Bean(name="desktop")
    public DesktopPC.Builder GetDesktopPCService(){
        return new DesktopPC.Builder();
    }
    @Bean(name="speaker")
    public Speaker.Builder GetSpeakerService(){
        return new Speaker.Builder();
    }
    @Bean(name="smartboard")
    public Smartboard.Builder GetSmartboardService(){
        return new Smartboard.Builder();
    }
    @Bean(name="tablet")
    public Tablet.Builder GetTabletService(){
        return new Tablet.Builder();
    }
    @Bean(name="studio")
    public Studio.Builder GetStudioService(){
        return new Studio.Builder("Suite 30A Buitenkloof Studios, Kloof street Cape Town");
    }
    @Bean(name="invoice")
    public Invoice.Builder GetInvoiceService(){
        return new Invoice.Builder(101);
    }
    @Bean(name="work_payment")
    public WorkPayment.Builder GetWorkPaymentService(){
        return new WorkPayment.Builder();
    }
    @Bean(name="cash")
    public Cash.Builder GetCashService(){
        return new Cash.Builder();
    }
}
