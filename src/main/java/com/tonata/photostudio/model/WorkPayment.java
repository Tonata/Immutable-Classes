/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.photostudio.model;

import com.tonata.photostudio.model.paymentPackage.Payment;
import com.tonata.photostudio.model.workTypePackage.Work;

/**
 *
 * @author student
 */
public final class WorkPayment {
    private final Payment payment;
    private final Work workType;
    
    private WorkPayment(Builder b){
        payment = b.payment;
        workType = b.workType;
    }
    
    public static class Builder{
        private Payment payment;
        private Work workType;
        
        public Builder payment(Payment p){
            payment = p;
            return this;
        }
        public Builder workType(Work work){
            workType = work;
            return this;
        }
        public WorkPayment build(){
            return new WorkPayment(this);
        }
    }

    public Payment getPayment() {
        return payment;
    }

    public Work getWorkType() {
        return workType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.payment != null ? this.payment.hashCode() : 0);
        hash = 67 * hash + (this.workType != null ? this.workType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WorkPayment other = (WorkPayment) obj;
        if (this.payment != other.payment && (this.payment == null || !this.payment.equals(other.payment))) {
            return false;
        }
        if (this.workType != other.workType && (this.workType == null || !this.workType.equals(other.workType))) {
            return false;
        }
        return true;
    }
    
}
