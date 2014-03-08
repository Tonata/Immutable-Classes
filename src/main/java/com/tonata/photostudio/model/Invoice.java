/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.photostudio.model;

/**
 *
 * @author student
 */
public final class Invoice {
    private final int invoiceNum;
    private final Cashier cashier;
    
    private Invoice(Builder b){
        invoiceNum = b.invoiceNum;
        cashier = b.cashier;
    }
    
    public static class Builder{
       private int invoiceNum;
       private Cashier cashier; 

        public Builder(int invoiceNum) {
            this.invoiceNum = invoiceNum;
        }
       
        public Builder cashier(Cashier c){
           cashier = c;
           return this;
        }
        public Invoice build(){
            return new Invoice(this);
        }
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public Cashier getCashier() {
        return cashier;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.invoiceNum;
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
        final Invoice other = (Invoice) obj;
        if (this.invoiceNum != other.invoiceNum) {
            return false;
        }
        return true;
    }
    
    
}

