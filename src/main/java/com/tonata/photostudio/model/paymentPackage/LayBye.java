/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.photostudio.model.paymentPackage;

import com.tonata.photostudio.model.Customer;

/**
 *
 * @author student
 */
public final class LayBye {
    private final double amount;
    private final String name;
    
    private LayBye(Builder b){
        amount = b.amount;
        name = b.name;
    }
    public static class Builder{
        private double amount;
        private String name;

        public Builder(String name) {
            this.name = name;
        }
        
        public Builder amount(double a){
            amount = a;
            return this;
        }
        public LayBye build(){
            return new LayBye(this);
        }
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
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
        final LayBye other = (LayBye) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    
}
